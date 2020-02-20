
public class Book {
	private int ID;
	private int score;
	
	Book(){
		
	}
	
	public Book(int iD, int score) {
		super();
		ID = iD;
		this.score = score;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
