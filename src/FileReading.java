import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    public FileReading() {
        Scanner scn = null;
        int bookNum, libNum, deadLine;
        try {
            scn = new Scanner(new File("Files/a_example.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String a = scn.nextLine();
        String[] s = a.split(" ");
        bookNum = Integer.parseInt(s[0]);
        libNum = Integer.parseInt(s[1]);
        deadLine = Integer.parseInt(s[2]);

        Book[] books = new Book[bookNum];
        a = scn.nextLine();
        s = a.split(" ");
        for (int i = 0; i < s.length; i++) {
            books[i] = (new Book(i, Integer.parseInt(s[i])));
        }

        Library[] libs = new Library[libNum];

        int libId=0;
        while (scn.hasNextLine()) {
            String line = scn.nextLine();
            String[] splitted=line.split(" ");
            libs[libId]=new Library(libId,Integer.parseInt(splitted[0]),Integer.parseInt(splitted[1]),Integer.parseInt(splitted[2]));
            line=scn.nextLine();
            splitted=line.split(" ");
            Book[] booksToSendOfLibrary = new Book[splitted.length];
            for (int i = 0; i < splitted.length; i++) {
                booksToSendOfLibrary[i]=books[Integer.parseInt(splitted[i])];
            }
            libs[libId].setBooks(booksToSendOfLibrary);
            libId++;
        }
        System.out.println(5);
        System.out.println(libs[0].getBookPerDay());
        System.out.println(6);
        System.out.println(libs[1].getBooks()[1].getScore());
        System.out.println(7);
    }


}

