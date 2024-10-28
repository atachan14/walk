package walk.maps;

import java.util.ArrayList;

import walk.main.Pos;
import walk.obj.Bridge;
import walk.obj.Nothing;
import walk.obj.Obj;
import walk.obj.OldBridge;
import walk.obj.River;

public class ObjGenerater extends MapGenerater{

	public void setTile() {
		for (int x = 0; x < getMap().length; x++) {
			for (int y = 0; y < getMap().length; y++) {
				Tile tile = new Tile();
				getMap()[y][x] = tile;
			}
		}
	}

	public void setNothing() {
		for (int x = 0; x < getMap().length; x++) {
			for (int y = 0; y < getMap().length; y++) {

				Nothing nothing = new Nothing(y, x);
				addMapOfThatTile(nothing);
			}
		}
	}
	
	public ArrayList<Obj> riverGene() {
		ArrayList<Obj> rivers = new ArrayList<Obj>();
		for (int x = 0; x < getMap().length; x++) {

			Pos pos = new Pos(getMapSize() / 2, x);
			River river = new River(pos);
			rivers.add(river);
		}
		return rivers;

	}
	
	public Obj[] bridgesGenerate() {
		int y = map.length / 2;
		int x = new java.util.Random().nextInt(getMap()[y].length - 2);
		Pos pos = new Pos(y, x);
		Bridge bridge = new Bridge(pos);

		int oldx = 0;
		while (true) {
			oldx = new java.util.Random().nextInt(getMap()[y].length);
			if (oldx != x && oldx != x + 1 && oldx != x + 2) {
				break;
			}
		}
		Pos oldPos = new Pos(y, oldx);
		OldBridge oldBridge = new OldBridge(oldPos);

		Obj[] bridges = new Obj[] { bridge, oldBridge };
		return bridges;
	}
}
