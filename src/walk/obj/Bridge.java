package walk.obj;

import walk.main.Pos;
import walk.main.WPM;

public class Bridge extends Obj {
	String name = " 橋 ";
	char nam = '橋';
	int objIndex = 120;

	boolean ride;
	String posMesse;
	String nextMesse;
	String aroundMesse;
	String cantWalkMesse;

	public Bridge(Pos pos) {
		super(pos);
	}

	public static Obj generate() {
		int x = new java.util.Random().nextInt(wpm.getMap().length);

		Pos pos = new Pos(wpm.getMap().length / 2, x);
		Bridge bridge = new Bridge(pos);
		return bridge;
	}

	public static Obj[] bridgesGenerate() {
		int y = wpm.getMap().length / 2;
		int x = new java.util.Random().nextInt(wpm.getMap()[y].length - 2);
		Pos pos = new Pos(y, x);
		Bridge bridge = new Bridge(pos);

		int oldx = 0;
		while (true) {
			oldx = new java.util.Random().nextInt(wpm.getMap().length);
			if (oldx != x && oldx != x + 1 && oldx != x + 2) {
				break;
			}
		}
		Pos oldPos = new Pos(y, oldx);
		OldBridge oldBridge = new OldBridge(oldPos);

		Obj[] bridges = new Obj[] { bridge, oldBridge };
		return bridges;
	}
}
