package walk.maps;

import walk.main.Night;
import walk.main.Player;

public class MapGenerater {
	Night night;
	ObjGenerater objGenerater;
	TileSearcher tileSearcher;
	MapTools mapTools;

	public MapGenerater(Night night) {
		this.night = night;
		this.mapTools = new MapTools(night);
		this.objGenerater = new ObjGenerater(night);
		this.tileSearcher = new TileSearcher(night);
	}

	public void selectNight() {
		switch (night.getNightCount()) {
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
		night.setMapSize(11);
		night.setMap(new Tile[night.getMapSize()][night.getMapSize()]);

		System.out.println("go set Tile");
		objGenerater.setTile();
		objGenerater.setNothing();
		mapTools.cheetMap();
		night.addTileOfMap(objGenerater.riverGene());
		night.addTileOfMap(objGenerater.bridgesGenerate());
		System.out.println("setBidges");

		night.setPlayer(new Player(tileSearcher.getAloneTile().getPos()));

	}

	public void night2gene() {

	}

	public void night3gene() {

	}

	public void night4gene() {
	}

}
