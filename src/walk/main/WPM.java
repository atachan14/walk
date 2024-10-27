package walk.main;

import walk.maps.MapManager;
import walk.maps.Tile;
import walk.obj.Obj;

public class WPM {
	MapManager mapManager = new MapManager(this);
	Obj obj = new Obj(this);
	Fase fase = new Fase(this);
	Player player;
	Tile[][] map;
	int mapSize;
	int night = 1;

	public WPM(int mapSize) {
		this.mapSize = mapSize;
		map = new Tile[mapSize][mapSize];
		
	}

	public void game() {
		fase.start();
		while (true) {
			fase.walk();
			fase.overDisplay();
			fase.underDisplay();
		}
	}
	
	public Tile[][] getMap() {
		return map;
	}
	
	public int getMapSize() {
		return mapSize;
	}
}
