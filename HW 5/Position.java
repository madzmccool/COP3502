/**
* A position on a board
* 
* x = row
* y = column
**/
public class Position{
	private int x; // Zero is the furthest left column
	private int y; // Zero is the highest row

	public Position(){
		this(-1,-1);
	}
	
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}

	public String toString(){
		return "["+x+","+y+"]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

