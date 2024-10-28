package walk.maps;

import walk.obj.Bridge;
import walk.obj.River;

public class MapGenerater extends MapManager {
	ObjGenerater objGenerater = new ObjGenerater();
	public void selectNight(int nightCount) {
		switch (nightCount) {
		case 1:
			night1gene();
			break;
		case 2:
			night2gene();
			break;
		case 3:
			night3gene();
			break;
		case 4:
			night4gene();
			break;
		default:
			break;
		}
	}

	public void night1gene() {
		this.mapSize = 11;
		map = new Tile[mapSize][mapSize];
		objGenerater.setTile();
		objGenerater.setNothing();
		addMapOfThatTile(objGenerater.riverGene());
		addMapOfThatTile(objGenerater.bridgesGenerate());

	}

	public void night2gene() {

	}

	public void night3gene() {

	}

	public void night4gene() {
	}

}
