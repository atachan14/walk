package walk.obj;

import walk.main.Night;
import walk.main.Pos;

public class Obj extends Night{
	Pos pos;
	int y;
	int x;

	String name;
	char nam;
	int index;//1xx:何もない 2xx:川 3xx:森

	boolean ride;
	String hereMesse;
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
	
	public Obj(int y, int x) {
		this.pos = new Pos(y,x);
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

	public String getName() {
		return name;
	}

	public char getNam() {
		return nam;
	}

	public int getIndex() {
		return index;
	}

	public boolean isRide() {
		return ride;
	}

	public String getHereMesse() {
		return hereMesse;
	}

	public String getNextMesse() {
		return nextMesse;
	}

	public String getAroundMesse() {
		return aroundMesse;
	}
}