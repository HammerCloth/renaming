import jdk.jfr.StackTrace;
import org.junit.Test;

import java.io.File;
import java.util.Scanner;

/**
 * @author:syx
 * @date: 2021/4/26 10:29
 * @version:v1.0
 */
public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\sun\\Desktop\\新建文件夹");
        File[] files = f.listFiles();
        for (File f1:files){
            String oldName = f1.getName();
            System.out.println(f1.getParentFile()+"\\"+changeName(oldName));
            f1.renameTo(new File(f1.getParentFile()+"\\"+changeName(oldName)));
        }


    }
    private static String changeName(String str){
        StringBuffer sb = new StringBuffer();
        sb.append(str.substring(0,str.length()-8));
        sb.append(str.substring(str.length()-6,str.length()));
        //sb.append(str.substring(str.length()-4,str.length()));
        return sb.toString();
    }

}
