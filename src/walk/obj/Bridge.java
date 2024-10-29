package walk.obj;

import walk.main.Pos;

public class Bridge extends Obj {

	public Bridge(Pos pos) {
		super(pos);

		this.name = " 橋 ";
		this.nam = '橋';
		this.index = 220;
	}

//	public static Obj generate() {
//		int x = new java.util.Random().nextInt(wpm.getMap().length);
//
//		Pos pos = new Pos(wpm.getMap().length / 2, x);
//		Bridge bridge = new Bridge(pos);
//		return bridge;
//	}

}
