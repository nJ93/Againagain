import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

/**
 * Created by Admin on 09.08.2017.
 */
public class FilesApp {

    static File dir = new File("D:\\123");

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();

        System.out.println(dir.isDirectory());
        for (File file : dir.listFiles()){
            System.out.println(file.getName());
        }
    }



}
