package com.bai.test.io;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
	
	public static void main(String[] args) {
		File tempPath;
		
		tempPath = new File("./temp");
        if(!tempPath.exists() || !tempPath.isDirectory())
        {
            tempPath.mkdir();  //如果不存在，则创建该文件夹
        }
        
        try
        {
            //在tempPath路径下创建临时文件"mytempfileXXXX.tmp"
            //XXXX 是系统自动产生的随机数, tempPath对应的路径应事先存在
            File tempFile = File.createTempFile("印刷卡号", ".txt", tempPath);
            System.out.println(tempFile.getAbsolutePath());
            FileWriter fout = new FileWriter(tempFile);
            PrintWriter out = new PrintWriter(fout);
            List<String> list = new ArrayList<String>();
            list.add("中文");
            list.add("asdf");
            list.add("asdfasdf");
            for(String s :list){
            	out.println(s);
            }
            out.println("some info!" );
            out.close(); //注意：如无此关闭语句，文件将不能删除
            //tempFile.delete();
//            tempFile.deleteOnExit();
        }
        catch(Exception e1)
        {
            System.out.println(e1);
        }
	}

}
