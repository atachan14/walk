package walk.obj;

import walk.main.Pos;
import walk.main.WPM;

public class Obj {
	static WPM wpm;

	Pos pos;
	int y;
	int x;

	String name;
	char nam;
	int objIndex;

	boolean ride;
	String posMesse;
	String nextMesse;
	String aroundMesse;
	String cantWalkMesse;

	public Obj() {
		
	}
	
	public Obj(Pos pos) {
		this.pos = pos;
		this.y = pos.gety();
		this.x = pos.getx();
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

	public String getName() {
		return name;
	}

	public char getNam() {
		return nam;
	}

	public int getObjIndex() {
		return objIndex;
	}

	public boolean isRide() {
		return ride;
	}

	public String getPosMesse() {
		return posMesse;
	}

	public String getNextMesse() {
		return nextMesse;
	}

	public String getAroundMesse() {
		return aroundMesse;
	}

	public static void setWPM(WPM wpmInst) {
		wpm = wpmInst;
	}
}