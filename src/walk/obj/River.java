package walk.obj;

import walk.main.Pos;

public class River extends Obj {
	String name = " 川 ";
	char nam = '川';
	int objIndex = 210;

	boolean ride = false;
	String hereMesse;
	String nextMesse;
	String aroundMesse;
	String cantWalkMesse;

	public River(Pos pos) {
		super(pos);
	}

	

}
