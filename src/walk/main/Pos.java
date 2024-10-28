package walk.main;

public class Pos {
	int y;
	int x;
	Pos[] aroundPos = new Pos[10];
	boolean hasAround = false;

	public Pos() {
	}

	public Pos(int x, int y) {
		this.y = y;
		this.x = x;

		setAroundPos();
	}

	public int gety() {
		return y;
	}

	public int getx() {
		return x;
	}

	public void sety(int y) {
		this.y = y;
	}

	public void setx(int x) {
		this.x = x;
	}

	public boolean getHasAround() {
		return hasAround;
	}

	public void setAroundPos() {
		for (int i = 0; i < aroundPos.length; i++) {
			aroundPos[i] = new Pos(); // デフォルト値で初期化
		}

		for (int i = 1; i < aroundPos.length; i++) {
			aroundPos[i].y = y + 1 - (i - 1) / 3;
			aroundPos[i].x = x - 1 + (i - 1) % 3;
		}
		hasAround = true;
	}

	public Pos[] getAroundPos() {
		return aroundPos;
	}

}
