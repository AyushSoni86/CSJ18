package FileHandling;

import java.io.File;
import java.io.IOException;

public class FirstDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("FileHandling.txt");
        file.createNewFile();
    }
}
