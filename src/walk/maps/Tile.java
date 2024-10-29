package walk.maps;

import java.util.ArrayList;

import walk.main.Night;
import walk.main.Pos;
import walk.obj.Obj;

public class Tile extends Night {
	public ArrayList<Obj> hasObj = new ArrayList<Obj>();
	public Pos pos;
	int y;
	int x;
	Tile[] aroundTile = new Tile[10];

	
	public Tile(int y, int x) {
		this.pos = new Pos(y, x);
		this.y = y;
		this.x = x;
	}

	public Obj getTop() {
		return hasObj.get(hasObj.size() - 1);
	}

	public Pos getPos() {
		return pos;
	}

	public Tile[] getAroundTile() {
		int y = 0;
		int x = 0;
		for (int i = 1; i < aroundTile.length; i++) {
			y = y + 1 - (i - 1) / 3;
			x = x - 1 + (i - 1) % 3;
			aroundTile[i] = getMap()[y][x];
		}
		return aroundTile;
		//		hasAround = true;
	}

	public boolean IsNothing() {
		int y = pos.gety();
		int x = pos.getx();
		if (getTop().getIndex() / 100 != 1) {
			return false;
		}
		return true;
	}

	public boolean IsAroundNothing() {
		for (int i = 1; i < 10; i++) {
			if (!getAroundTile()[i].IsNothing()) {
				return false;
			}
		}
		return true;
	}
}
