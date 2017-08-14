import java.io.File;

/**
 * Created by Admin on 09.08.2017.
 */
public class FilesApp {

    static File dir = new File("D:\\123");

    public static void main(String[] args) {
        System.out.println(dir.isDirectory());
        for (File file : dir.listFiles()){
            System.out.println(file.getName());
        }
    }

}
