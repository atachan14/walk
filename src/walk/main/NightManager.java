package walk.main;

import walk.maps.MapGenerater;
import walk.maps.MapManager;
import walk.maps.Tile;
import walk.obj.Obj;

public class NightManager {
	MapManager mapManager;
	MapGenerater mapGenerater;
	Fase fase;
	
	int nightCount = 0;
	public Tile[][] map;
	public int mapSize;
	Player p;


	public NightManager() {
	
	}
	
	public void setUp(int nightCount) {
		this.nightCount = nightCount;
		mapManager = new MapManager();
		mapGenerater = new MapGenerater();
		fase = new Fase();
		
	}

	public void game() {

		mapGenerater.selectNight(nightCount);
		this.map = mapManager.getMap();

		fase.start();
		while (true) {
			fase.walk();
			fase.overDisplay();
			fase.underDisplay();
		}
	}

	public int getNightCount() {
		return nightCount;
	}

	public Tile[][] getMap() {
		return map;
	}

	public Obj getMapTop(Pos pos) {
		int y = pos.gety();
		int x = pos.getx();
		return map[y][x].getTop();
	}

	public int getMapSize() {
		return mapSize;
	}

}
