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
            myWriter.write("singed up library count\n\n");
            for (int i = 0; i < libraries.length; i++) {
                if (libraries[i]!=null){
                    if (libraries[i].getBooksent()!=null){
                        myWriter.write(libraries[i].getLibraryID()+" "+libraries[i].getBooksent().size()+" \n\n");
                        for (Object x:libraries[i].getBooksent()
                        ) {
                            myWriter.write(((Book)x).getID()+" ");
                        }
                        myWriter.write("\n\n");
                    }

                }

            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file");
            e.printStackTrace();
        }
    }
}
