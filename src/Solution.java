import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    Book[] books;
    Library[] libraries;
    public Solution(Book[] books, Library[] libraries) {
        this.books = books;
        this.libraries = libraries;
    }
    public void printSolution(){

        try {
            FileWriter myWriter = new FileWriter("Solution.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!\n");
            myWriter.write("213466666666666666666666666666gregfd");
            myWriter.write("singed up library count");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file");
            e.printStackTrace();
        }
    }
}
