package walk.maps;
import java.util.ArrayList;
import walk.obj.*;

public class Tile {
	public ArrayList<Obj> hasObj = new ArrayList<Obj>();
	
	public Obj getTop() {
		return hasObj.get(hasObj.size()-1);
	}
}
