package walk.maps;

import walk.main.WPM;
import walk.obj.*;

public class MapManager {
	WPM wpm;
	ObjGenerater obG;

	public MapManager(WPM wpm) {
		this.wpm = wpm;
		this.obG =new ObjGenerater(wpm);
	}

	public void generateMap() {
		obG.setTile();
		obG.generateRiver();
		obG.generateBridge();
		obG.generateDog();
		obG.generateKey();
		obG.generateHome();
	}

	

	public void addHasObj(int y, int x, Obj obj) {
		wpm.getMap()[y][x].hasObj.add(obj);
	}
}
