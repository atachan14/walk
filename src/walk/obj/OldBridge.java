package walk.obj;

import walk.maps.Pos;

public class OldBridge extends Obj {

	public OldBridge(Pos pos) {
		super(pos);

		this.name = "旧橋";
		this.nam = '旧';
		this.index = 221;
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
