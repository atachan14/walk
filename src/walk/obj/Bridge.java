package walk.obj;

import walk.main.Pos;
import walk.main.NightManager;

public class Bridge extends Obj {
	String name = " 橋 ";
	char nam = '橋';
	int objIndex = 120;

	boolean ride;
	String hereMesse;
	String nextMesse;
	String aroundMesse;
	String cantWalkMesse;

	public Bridge(Pos pos) {
		super(pos);
	}

//	public static Obj generate() {
//		int x = new java.util.Random().nextInt(wpm.getMap().length);
//
//		Pos pos = new Pos(wpm.getMap().length / 2, x);
//		Bridge bridge = new Bridge(pos);
//		return bridge;
//	}


}
