package walk.maps;

import walk.main.Night;
import walk.main.Pos;

public class MapTools extends Night{

	public MapTools() {
		
	}

	public boolean pointIsNothing(Pos pos) {
		int y = pos.gety();
		int x = pos.getx();
		if (getMapTop(pos).getIndex()/100==1) {
			return true;
		}
		return false;
	}

	
}
