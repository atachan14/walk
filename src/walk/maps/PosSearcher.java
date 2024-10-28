package walk.maps;

import walk.main.Pos;

public class PosSearcher extends MapManager{

	
	
	public Pos bridge() {
		int y = map.length / 2;
		int x = new java.util.Random().nextInt(map[y].length - 2);
		Pos pos = new Pos(y, x);

		return pos;
	}
	
	public Pos bridge2nd(Pos ngpos) {
		int y = getMap().length / 2;
		int x = 0;
		int ngx= ngpos.getx();
		while (true) {
			x = new java.util.Random().nextInt(getMap()[y].length);
			if (x != ngx && x != ngx + 1 && x != ngx + 2) {
				break;
			}
		}
		Pos pos = new Pos(y, x);
		return pos;
	}
}
