package walk.maps;

public class InTile {
	Pos pos;
	int posy;
	int posx;

	public InTile() {

	}

	public InTile(Pos pos) {
		this.pos = pos;
		this.posy = pos.gety();
		this.posx = pos.getx();
	}

	public InTile(int y, int x) {
		this.pos = new Pos(y, x);
		this.posy = y;
		this.posx = x;
	}
	
	public Pos getPos() {
		return pos;
	}

	public void setPos(Pos pos) {
		this.pos = pos;
		this.posy = pos.gety();
		this.posx = pos.getx();
	}

	public int gety() {
		return posy;
	}

	public void sety(int y) {
		this.posy = y;
	}

	public int getx() {
		return posx;
	}

	public void setx(int x) {
		this.posx = x;
	}
}
