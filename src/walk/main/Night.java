package walk.main;

import java.util.ArrayList;

import walk.maps.MapGenerater;
import walk.maps.MapManager;
import walk.maps.Tile;
import walk.obj.Obj;

public class Night {
	MapManager mapManager;
	MapGenerater mapGenerater;
	Fase fase;

	int nightCount = 0;
	Tile[][] map;
	int mapSize;
	Player p;

	public Night() {

	}

	public void setUp(int nightCount) {
		this.nightCount = nightCount;
		mapManager = new MapManager();
		fase = new Fase();

		mapGenerater = new MapGenerater();

	}

	public void game() {

		mapGenerater.selectNight();
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
	
	public void setMap(Tile[][] map) {
		this.map = map;
	}

	public int getMapSize() {
		return mapSize;
	}

	public void setMapSize(int num) {
		this.mapSize = num;
	}

	public Tile[][] getMap() {
		return map;
	}
	
	public Tile[][] getMapTile() {
		return map;
	}
	
	public Pos getMapPos(int y , int x) {
		return map[y][x].getPos();
	}
	
	public Obj getMapTop(int y ,int x) {
		return map[y][x].hasObj.get(map[y][x].hasObj.size() - 1);
	}

	public Obj getMapTop(Pos pos) {
		int y = pos.gety();
		int x = pos.getx();
		return map[y][x].hasObj.get(map[y][x].hasObj.size() - 1);
	}

	public void addMapOfThatTile(Obj obj) {
		int y = obj.gety();
		int x = obj.getx();
		getMap()[y][x].hasObj.add(obj);
	}

	public void addMapOfThatTile(ArrayList<Obj> objs) {
		for (Obj obj : objs) {
			int y = obj.gety();
			int x = obj.getx();
			getMap()[y][x].hasObj.add(obj);
		}
	}

	public void addMapOfThatTile(Obj[] objs) {
		for (Obj obj : objs) {
			int y = obj.gety();
			int x = obj.getx();
			getMap()[y][x].hasObj.add(obj);
		}
	}

	public void addMapOfThatTile(int y, int x, Obj obj) {
		getMap()[y][x].hasObj.add(obj);
	}

}
