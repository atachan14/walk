package walk.maps;

import walk.main.Night;

public class TileSearcher {
	static Night night;

	public static void setNight(Night nightInst) {
		night = nightInst;
	}

	public static void addToAll(int index) {
		for (int y = 0; y < night.getMap().length; y++) {
			for (int x = 0; x < night.getMap().length; x++) {
				night.getMap()[y][x].hasObj.add(ObjGenerater.geneForIndex(index));
			}
		}
	}

	public static void addToBridgeZone(int index) {
		int y = night.getMap().length / 2;
		int x = new java.util.Random().nextInt(night.getMap()[y].length - 2);
		night.getMap()[y][x].hasObj.add(ObjGenerater.geneForIndex(index));
	}

	public Pos bridge2nd(Pos ngpos) {
		int y = night.getMap().length / 2;
		int x = 0;
		int ngx = ngpos.getx();
		while (true) {
			x = new java.util.Random().nextInt(night.getMap()[y].length);
			if (x != ngx && x != ngx + 1 && x != ngx + 2) {
				break;
			}
		}
		Pos pos = new Pos(y, x);
		return pos;
	}

	public Tile getAloneTile() {
		int count = 0;
		while (count < 100) {
			int y = new java.util.Random().nextInt(night.getMap().length);
			int x = new java.util.Random().nextInt(night.getMap()[y].length);
			if (night.getMapTile(y, x).isAroundNothing()) {
				return night.getMapTile(y, x);
			}
			count++;
		}
		//error用メッセ
		System.out.println("TileSearchr.aloneTile();100count");
		return new Tile(-100, -100);
	}
}
