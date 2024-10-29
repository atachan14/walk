package walk.main;

public class Pos extends Night {
	int y;
	int x;
	Pos[] aroundPos = new Pos[10];
	//	boolean hasAround = false;

	//	public Pos() {
	//	}

	public Pos(int x, int y) {
		this.y = y;
		this.x = x;
	}

	//	public void setyx(int y, int x) {
	//		this.y = y;
	//		this.x = x;
	//	}

	public int gety() {
		return y;
	}

	public int getx() {
		return x;
	}

	//	public boolean getHasAround() {
	//		return hasAround;
	//	}

}