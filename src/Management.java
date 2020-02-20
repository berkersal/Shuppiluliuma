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
	
	
}
