
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class CompareJavaTest {
	public static void main(String[] args) {
		String pathname = "E:\\ApplicationResources_zh_CN.properties";
		String newPath ="E:\\a.txt";
		clear(pathname, newPath); // 调用去重复的方法...
	}

	/**
	 * 
	 * @param pathname
	 *            源文件路径
	 * @param newPath
	 *            新的文件路径
	 * @throws Exception
	 */
	public static void clear(String pathname, String newPath) {

		System.out.println("Start... ");

		try { // 懒的写Try..直接都包围起来吧....

			File file = new File(pathname);
			BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));

			BufferedReader buffer = new BufferedReader(new InputStreamReader(fis, "utf-8"));// 用5M的缓冲读取文本文件

			// FileWriter fw = new FileWriter(new File(newPath),true); //去除后的文本

			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(new File(newPath)), "utf-8");

			Set<String> set = new HashSet<String>();
			String temp = ""; // 临时字符串
			int x = 0;
			while ((temp = buffer.readLine()) != null) { // 读文件,一行读一个
				set.add(temp); // 存储到Set集合里面
				if (x % 30000 == 0) {
					System.out.print("..");
				}
				x++;
			}
			fis.close();
			buffer.close(); // 关闭读取操作

			// 下面开始写文件

			for (String xxser : set) {
				out.write(xxser + "\r\n");

			}
			System.out.println("");
			out.close(); // 关闭写操作
			System.out.println("size = " + set.size());
			System.out.println("End...");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("文件太大了,建议先100MB大小..");
		}

	}



}
