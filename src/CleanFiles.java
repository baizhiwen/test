import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Vector;
 
public class CleanFiles {
 
    private static Vector<String> stringlist;
 
    public static void main(String[] args) throws Exception {
        String filePath1;
        String filePath2;
        String filePath3;
        String item;
        stringlist = new Vector<String>();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(
                System.in));
        System.out.println("请输入文件1路径和文件名：");
        filePath1 = buffer.readLine();
        System.out.println("请输入文件2路径和文件名：");
        filePath2 = buffer.readLine();
        System.out.println("请输入合并后文件路径和文件名");
        filePath3 = buffer.readLine();
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);
        File file3 = new File(filePath3);
        buffer.close();
        buffer = new BufferedReader(new FileReader(file1));
        while((item=buffer.readLine())!=null){
            addString(stringlist,item);
        }
        buffer.close();
        buffer = new BufferedReader(new FileReader(file2));
        while((item= buffer.readLine())!=null){
            addString(stringlist,item);
        }
        buffer.close();
 
        // 搜索结果是经过排序的，根据此规律删除不合要求File
        for (int i = 0; i < stringlist.size()-1; i++) {
            if(stringlist.get(i).equals(stringlist.get(i+1))){
                stringlist.remove(i);
                if(i!=0)i--;
            }
        }
         
        BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(file3));
        for(String temp:stringlist){
            bufferWriter.write(temp);
            bufferWriter.newLine();
        }
        bufferWriter.close();
         
         
    }
 
    public static void addString(Vector<String> allStrings, String str) {
        if (allStrings.isEmpty()) {
            allStrings.add(str);
        } else {
 
            // 二分查找法
            int left = 0, right = allStrings.size() - 1, middle, compare;
            if (str.compareToIgnoreCase(allStrings.get(right)) >= 0) {
                allStrings.add(str);
                return;
            }
            if (str.compareToIgnoreCase(allStrings.get(0)) <= 0) {
                allStrings.add(0, str);
                return;
            }
            while (true) {
                middle = (left + right) / 2;
                compare = str.compareToIgnoreCase(allStrings.get(middle));
                if (compare == 0 || middle == left) {
                    allStrings.add(middle + 1, str);
                    return;
                } else {
                    if (compare < 0) {
                        right = middle;
                    } else {
                        left = middle;
                    }
                }
            }
        }
    }
}