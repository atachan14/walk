package walk.maps;

import walk.main.Night;

public class MapTools {
	Night night;

	public MapTools(Night night) {
		this.night = night;
	}

	public void cheetMap() {
		for (int i = 0; i < night.getMap().length; i++) {
			for (int j = 0; j < night.getMap().length; j++) {
				if (night.getMap()[i][j].getTop().getIndex() / 10 == 0) {
					System.out.print("[00" + night.getMap()[i][j].getTop().getIndex() + "]");
				} else if (night.getMap()[i][j].getTop().getIndex() / 100 == 0) {
					System.out.print("[0" + night.getMap()[i][j].getTop().getIndex() + "]");
				} else {
					System.out.print("[" + night.getMap()[i][j].getTop().getIndex() + "]");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}

}
