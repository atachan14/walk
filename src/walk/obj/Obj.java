package walk.obj;

import walk.main.InTile;
import walk.main.Night;
import walk.main.Pos;

public class Obj extends InTile{
	String name;
	char nam;
	int index;

	boolean ride;
	String hereMesse;
	String nextMesse;
	String aroundMesse;
	String cantWalkMesse;

	public Obj() {
		
	}
	
	public Obj(Pos pos) {
		super(pos);
	}
	
	public Obj(int y, int x) {
		super(y,x);
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