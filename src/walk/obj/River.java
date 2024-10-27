package walk.obj;

import java.util.ArrayList;

import walk.main.Pos;
import walk.main.WPM;

public class River extends Obj {
	String name = " 川 ";
	char nam = '川';
	int objIndex = 110;

	boolean ride = false;
	String posMesse;
	String nextMesse;
	String aroundMesse;
	String cantWalkMesse;

	public River(Pos pos) {
		super(pos);
	}

	public static Pos genePos(WPM wpm) {
		ArrayList<Pos> posz=new ArrayList<Pos>(); 
		for (int x = 0; x < wpm.getMap().length; x++) {
			Pos pos = new Pos(wpm.getMapSize() / 2, x);
			posz.add(pos);
		}

	}
	

}
