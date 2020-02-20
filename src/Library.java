import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Library {
    int libraryID;
    int numberOfBooks;
    int signupTime;
    int bookPerDay;
    Book[] books;
    ArrayList booksent;

    public Library(int libraryID, int numberOfBooks, int signupTime, int bookPerDay) {
        this.libraryID = libraryID;
        this.numberOfBooks = numberOfBooks;
        this.signupTime = signupTime;
        this.bookPerDay = bookPerDay;
    }

    public Library(int libraryID, int numberOfBooks, int signupTime, int bookPerDay, Book[] books) {
        this.libraryID = libraryID;
        this.numberOfBooks = numberOfBooks;
        this.signupTime = signupTime;
        this.bookPerDay = bookPerDay;
        this.books = books;
    }

    public int getLibraryID() {

        return libraryID;
    }

    public void setLibraryID(int libraryID) {
        this.libraryID = libraryID;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public int getSignupTime() {
        return signupTime;
    }

    public void setSignupTime(int signupTime) {
        this.signupTime = signupTime;
    }

    public int getBookPerDay() {
        return bookPerDay;
    }

    public void setBookPerDay(int bookPerDay) {
        this.bookPerDay = bookPerDay;
    }

    public ArrayList getBooksent() {
        return booksent;
    }

    public void setBooksent(ArrayList booksent) {
        this.booksent = booksent;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
