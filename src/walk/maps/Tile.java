package walk.maps;

import java.util.ArrayList;

import walk.main.Night;
import walk.main.Player;
import walk.main.Pos;
import walk.obj.Obj;

public class Tile extends Night {
	public ArrayList<Obj> hasObj = new ArrayList<Obj>();
	public ArrayList<Player> hasPlayer = new ArrayList<Player>();
	Pos pos;
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
		for (int i = 1; i < aroundTile.length; i++) {
			int aroundy = y + 1 - (i - 1) / 3;
			int aroundx = x - 1 + (i - 1) % 3;
			System.out.println(i+",y"+y+",aroundy"+aroundy+",x"+x+",aroundx"+aroundx);
			aroundTile[i] = getMap()[aroundy][aroundx];
		}
		
		return aroundTile;
		// hasAround = true;
	}

	public boolean isNothing() {
		System.out.println(getTop().getIndex());
		if (getTop().getIndex() / 100 == 1) {
			System.out.println("isNothing true");
			return true;
		}
		System.out.println("isNothing false");
		return false;
	}

	public boolean isAroundNothing() {
		for (int i = 1; i < 10; i++) {
			if (getAroundTile()[i].isNothing()) {
				return true;
			}
		}
		System.out.println("isAroundNothing ");
		return false;
	}

}
