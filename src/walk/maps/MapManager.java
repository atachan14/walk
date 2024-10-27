package walk.maps;

import java.util.ArrayList;

import walk.main.WPM;
import walk.obj.*;

public class MapManager {
	WPM wpm;
	ObjGenerater obG;

	public MapManager(WPM wpm) {
		this.wpm = wpm;
		this.obG = new ObjGenerater(wpm);
	}

	public void generateMap() {
		obG.setTile();
		addMapOfTile(River.generate());
		addMapOfTile(Bridge.bridgesGenerate());
		obG.generateKey();
		obG.generateHome();
	}

	public void addMapOfTile(Obj obj) {
		int y = obj.gety();
		int x = obj.getx();
		wpm.getMap()[y][x].hasObj.add(obj);
	}

	public void addMapOfTile(ArrayList<Obj> objs) {
		for (Obj obj : objs) {
			int y = obj.gety();
			int x = obj.getx();
			wpm.getMap()[y][x].hasObj.add(obj);
		}
	}

	public void addMapOfTile(Obj[] objs) {
		for (Obj obj : objs) {
			int y = obj.gety();
			int x = obj.getx();
			wpm.getMap()[y][x].hasObj.add(obj);
		}
	}

	public void addMapOfTile(int y, int x, Obj obj) {
		wpm.getMap()[y][x].hasObj.add(obj);
	}
}
