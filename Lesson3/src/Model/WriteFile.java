package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {
    public void writeFile(String[] arr) throws IOException {
        File file = new File(arr[0]);
        if (file.exists()) {
            try(FileWriter writer = new FileWriter(file, true)){
            for (String a : arr) {
                writer.write("<" + a + ">");
            }
            writer.write("\n");
            }
        }else {try(FileWriter writer = new FileWriter(file)){
            for (String a : arr) {
                writer.write("<" + a + ">");
            }
            writer.write("\n");
        }
        }
    }
}
