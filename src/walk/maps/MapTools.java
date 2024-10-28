package walk.maps;

import walk.main.Pos;
import walk.main.NightManager;

public class MapTools {
	NightManager wpm;

	public MapTools(NightManager wpm) {
		this.wpm = wpm;
	}

	public boolean pointIsNothing(Pos pos) {
		int y = pos.gety();
		int x = pos.getx();
		if (wpm.getMap()[y][x].hasObj.size() > 0) {
			return false;
		}
		return true;
	}

	public boolean aroundIsNothing(Pos pos) {
		if (!pos.getHasAround()) {
			pos.setAroundPos();
		}
		for (int i = 1; i < 10; i++) {
			if (!pointIsNothing(pos.getAroundPos()[i])) {
				return false;
			}
		}
		return true;
	}
}
