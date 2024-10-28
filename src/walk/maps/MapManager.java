package walk.maps;

import java.util.ArrayList;

import walk.main.Pos;
import walk.main.NightManager;
import walk.obj.*;

public class MapManager extends NightManager{
	
	
	public MapManager() {
		
	}

	

	public int getMapSize() {
		return mapSize;
	}
	
	public Tile[][] getMap() {
		return map;
	}
	
	public Obj getMapTop(Pos pos) {
		int y = pos.gety();
		int x = pos.getx();
		return map[y][x].getTop();
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
