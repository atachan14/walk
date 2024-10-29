package walk.maps;

import walk.main.Night;

public class MapTools {
	Night night;

	public MapTools(Night night) {
		this.night = night;
	}

	public void cheetMap() {
		for (int y = 0; y < night.getMap().length; y++) {
			for (int x = 0; x < night.getMap().length; x++) {
				if (night.getMap()[y][x].getTop().getIndex() / 10 == 0) {
					System.out.print("[00" + night.getMap()[y][x].getTop().getIndex() + "]");
				} else if (night.getMap()[y][x].getTop().getIndex() / 100 == 0) {
					System.out.print("[0" + night.getMap()[y][x].getTop().getIndex() + "]");
				} else {
					System.out.print("[" + night.getMap()[y][x].getTop().getIndex() + "]");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}

}
