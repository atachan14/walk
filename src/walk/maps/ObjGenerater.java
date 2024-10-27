package walk.maps;

import walk.main.WPM;
import walk.obj.Bridge;
import walk.obj.NewBridge;
import walk.obj.Obj;
import walk.obj.OldBridge;
import walk.obj.River;

public class ObjGenerater {
	WPM wpm;
	public ObjGenerater(WPM wpm) {
		this.wpm = wpm;
	}
	
	public void setTile() {
		for (int x = 0; x < wpm.getMap().length; x++) {
			for (int y = 0; y < wpm.getMap().length; y++) {
				Tile tile = new Tile();
				wpm.getMap()[y][x] = tile;
			}
		}
	}

	public void generateRiver() {
		for (int x = 0; x < wpm.getMap().length; x++) {
			River river = new River();
			addHasObj(wpm.getMap().length / 2, x, river);
		}
	}

	public void geneBridge() {
		Bridge bridge = new Bridge(Bridge.genePos(wpm));
		addHasObj(bridge);

		int oldB;
		while (true) {
			oldB = new java.util.Random().nextInt(wpm.getMap()[wpm.getMap().length / 2].length);
			for (int i = 0; i < 3; i++) {
				if (oldB == newB - 1 + i) {
					continue;
				}
			}
			break;
		}
		OldBridge oldBridge = new OldBridge();
		addHasObj(wpm.getMap().length / 2, oldB, oldBridge);
	}
	
	public void geneDeepForest() {
		int x = new java.util.Random().nextInt(wpm.getMapSize());
		int y = new java.util.Random().nextInt(wpm.getMapSize());
		
	}
	
	
	
	public void addHasObj(int y, int x, Obj obj) {
		wpm.getMap()[y][x].hasObj.add(obj);
	}
	
	public void addHasObj(Obj obj) {
		int y=obj.gety();
		int x = obj.getx();
		wpm.getMap()[y][x].hasObj.add(obj);
	}
}
