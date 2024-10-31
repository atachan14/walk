package walk.obj;

import walk.maps.Pos;

public class River extends Obj {

	public River(Pos pos) {
		super(pos);

		this.name = " 川 ";
		this.nam = '川';
		this.index = 210;

		this.ride = false;
	}
	
	public River() {
		this.name = " 川 ";
		this.nam = '川';
		this.index = 210;

		this.hereMesse = "";
		this.nextMesse = "川だ";
	}

}
