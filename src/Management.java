import java.util.ArrayList;

public class Management {
	private ArrayList<Book> scannedBooks;
	private int deadLineTime;
	
	public Management() {
		
	}
	
	public ArrayList<Book> getScannedBooks() {
		return scannedBooks;
	}
	public void setScannedBooks(ArrayList<Book> scannedBooks) {
		this.scannedBooks = scannedBooks;
	}
	public int getDeadLineTime() {
		return deadLineTime;
	}
	public void setDeadLineTime(int deadLineTime) {
		this.deadLineTime = deadLineTime;
	}
	public void MAINFOR(Library[] libraries){
		int index = 0;
		for (int i = 0; i < getDeadLineTime(); i++) {
			if (libraries[index].signupTime > 0){
				signUp(libraries[index]);
				for (int j = 0; j < libraries[index].signupTime; j++)
					scan(libraries);
			}
			index++;
		}
	}
	public void signUp(Library lib){
		lib.signupTime = 0;
	}
	public void scan(Library[] libraries){
		int index = 0;
		while (libraries[index].signupTime != 0){
			scanBestBook(libraries[index]);

			index++;
		}
	}
	public void  scanBestBook(Library lib){
		for (int i = 0; i < lib.bookPerDay; i++) {
			lib.booksent.add(lib.books[i]);
		}
	}
	
}
