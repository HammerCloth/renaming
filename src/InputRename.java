import java.io.File;
import java.util.Scanner;

/**
 * @author:syx
 * @date:2021/5/6 8:53
 * @version:v1.0
 */
public class InputRename {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File files = new File("C:\\Users\\sun\\Desktop\\简况表\\简况表");
        File[] listFiles = files.listFiles();
        for (File f:listFiles){
            System.out.println(f.getName());
            String newName = sc.nextLine();
            System.out.println(f.getParentFile()+"\\"+newName);
            f.renameTo(new File(f.getParentFile()+"\\"+newName));
        }
        sc.close();
    }
}
