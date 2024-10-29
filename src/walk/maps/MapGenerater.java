package walk.maps;

import walk.main.Night;

public class MapGenerater extends Night {
	ObjGenerater objGenerater;
	TileSearcher tileSearcher;

	public MapGenerater() {
		this.objGenerater = new ObjGenerater();
		this.tileSearcher = new TileSearcher();
	}

	public void selectNight() {
		switch (getNightCount()) {
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
		setMapSize(11);
		setMap(new Tile[getMapSize()][getMapSize()]);

		objGenerater.setTile();
		objGenerater.setNothing();
		addMapOfThatTile(objGenerater.riverGene());
		addMapOfThatTile(objGenerater.bridgesGenerate());
		tileSearcher.
	}

	public void night2gene() {

	}

	public void night3gene() {

	}

	public void night4gene() {
	}

}
