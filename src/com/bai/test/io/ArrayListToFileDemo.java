package com.bai.test.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 数据源：ArrayList<String>
 * 目的地：a.txt
 */
public class ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("啊啊啊");

		// 封装目的地
		// FileWriter fw = new FileWriter("a.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("./temp/a.txt"));

		for (String s : array) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}

		bw.close();
	}
}