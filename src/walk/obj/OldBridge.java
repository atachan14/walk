package walk.obj;

import walk.main.Pos;

public class OldBridge extends Obj {
	String name = "旧橋";
	char nam = '旧';
	int objIndex = 121;

	boolean ride;
	String hereMesse;
	String nextMesse;
	String aroundMesse;
	String cantWalkMesse;

	public OldBridge(Pos pos) {
		super(pos);
	}
}

//	public static Obj generate(int bridgex) {
//		int x;
//		while (true) {
//			x = new java.util.Random().nextInt(wpm.getMap().length);
//			if (x != bridgex - 1 && x != bridgex && x != bridgex + 1) {
//				break;
//			}
//		}
//		Pos pos = new Pos(wpm.getMap().length / 2, x);
//		OldBridge oldBridge = new OldBridge(pos);
//		return oldBridge;
//	}
//}
