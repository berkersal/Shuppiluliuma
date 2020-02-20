import java.io.*;

public class FileReading {
    public FileReading() throws IOException {
        File file = new File("/Files/c_incunabula");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}

