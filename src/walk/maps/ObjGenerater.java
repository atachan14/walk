package walk.maps;

import java.util.ArrayList;

import walk.main.Night;
import walk.main.Pos;
import walk.obj.Bridge;
import walk.obj.Nothing;
import walk.obj.Obj;
import walk.obj.OldBridge;
import walk.obj.River;

public class ObjGenerater {
	Night night;
	
	public ObjGenerater(Night night) {
		this.night = night;
	}

	public void setTile() {
		for (int x = 0; x < night.getMap().length; x++) {
			for (int y = 0; y < night.getMap().length; y++) {
				Tile tile = new Tile(y, x);
				night.getMap()[y][x] = tile;
			}
		}
	}

	public void setNothing() {
		for (int x = 0; x < night.getMap().length; x++) {
			for (int y = 0; y < night.getMap().length; y++) {

				Nothing nothing = new Nothing(y, x);
				night.addTileOfMap(nothing);
			}
		}
	}

	public ArrayList<Obj> riverGene() {
		ArrayList<Obj> rivers = new ArrayList<Obj>();
		for (int x = 0; x < night.getMap().length; x++) {

			Pos pos = new Pos(night.getMapSize() / 2, x);
			River river = new River(pos);
			rivers.add(river);
		}
		return rivers;
	}

	public Obj[] bridgesGenerate() {
		int y = night.getMap().length / 2;
		int x = new java.util.Random().nextInt(night.getMap()[y].length - 2);
		Pos pos = new Pos(y, x);
		Bridge bridge = new Bridge(pos);

		int oldx = 0;
		while (true) {
			oldx = new java.util.Random().nextInt(night.getMap()[y].length);
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
