public class Library {
    int libraryID;
    int numberOfBooks;
    int signupTime;
    int bookPerDay;
    int[] books;

    public Library(int libraryID, int numberOfBooks, int signupTime, int bookPerDay, int[] books) {
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

    public int[] getBooks() {
        return books;
    }

    public void setBooks(int[] books) {
        this.books = books;
    }
}
