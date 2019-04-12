package com.bai.test.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		// 创建对象
		// Writer w = new FileWriter("bw.txt");
		// BufferedWriter bw = new BufferedWriter(w);
		BufferedWriter bw = new BufferedWriter(new FileWriter("./temp/bw.txt"));

		bw.write("hello\r\n");
		bw.write("world\r\n");
		bw.write("java\r\n");
		bw.flush();

		// w.close(); bw的关闭底层其实就是关闭w。
		bw.close();
	}
}
