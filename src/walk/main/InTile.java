package walk.main;

public class InTile {
	Pos pos;
	int y;
	int x;

	public InTile() {

	}

	public InTile(Pos pos) {
		this.pos = pos;
		this.y = pos.gety();
		this.x = pos.getx();
	}

	public InTile(int y, int x) {
		this.pos = new Pos(y, x);
		this.y = y;
		this.x = x;
	}
	
	public Pos getPos() {
		return pos;
	}

	public void setPos(Pos pos) {
		this.pos = pos;
		this.y = pos.gety();
		this.x = pos.getx();
	}

	public int gety() {
		return y;
	}

	public void sety(int y) {
		this.y = y;
	}

	public int getx() {
		return x;
	}

	public void setx(int x) {
		this.x = x;
	}
}
