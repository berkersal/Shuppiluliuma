import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    public FileReading() {
        Scanner scn = null;
        try {
            scn = new Scanner(new File("Files/a_example.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scn.hasNext())
            System.out.println(scn.next() + " ");
    }
}

