package walk.maps;

public class Player extends InTile {

	int direction = 2;
	Pos now
	Pos nextPos = new Pos(0, 0);
	int nexty = 0;
	int nextx = 0;

	public Player() {
		this.direction = new java.util.Random().nextInt(4);
		this.nextPos = new Pos(this.pos);
		updateNextPos();
	}

	public Player(Pos pos) {
		super(pos);
		this.direction = new java.util.Random().nextInt(4);
		this.nextPos = new Pos(this.pos);
		updateNextPos();
	}

	public Player(int y, int x) {
		super(y, x);
		this.direction = new java.util.Random().nextInt(4);
		this.nextPos = new Pos(this.pos);
		updateNextPos();
	}

	public Pos getNextPos() {
		return nextPos;
	}

	public int getNexty() {
		return nexty;
	}

	public int getNextx() {
		return nextx;
	}

	public void updateNextPos() {
		System.out.println("y"+pos.gety()+",x"+pos.getx());
		System.out.println("nexty"+nextPos.gety()+",nextx"+nextPos.getx());
		System.out.println("direction"+direction);
		
		switch (direction) {
		case 0:
			nexty = posy + 1;
			nextx = posx;
			break;
		case 1:
			nexty = posy;
			nextx = posx - 1;
			break;
		case 2:
			nexty = posy - 1;
			nextx = posx;
			break;
		case 3:
			nexty = posy;
			nextx = posx + 1;
			break;
		default:
			System.out.println("updateNextPosバグ");
			break;
		}
		System.out.println("idougo");
		System.out.println("y"+posy+",x"+posx);
		System.out.println("nexty"+nexty+",nextx"+nextx);
		System.out.println("direction"+direction);
			

		nexty = MapTools.edgeOverExe(nexty);
		nextx = MapTools.edgeOverExe(nextx);
		nextPos.setyx(nexty, nextx);
	}

	public void moveForward() {
		setPos = nextPos;
		updateNextPos();
	}

	public void dcLeft() {
		switch (direction) {
		case 0:
			direction = 3;
			break;
		case 1:
			direction = 0;
			break;
		case 2:
			direction = 1;
			break;
		case 3:
			direction = 2;
			break;
		}
		updateNextPos();
	}

	public void dcRight() {
		switch (direction) {
		case 0:
			direction = 1;
			break;
		case 1:
			direction = 2;
			break;
		case 2:
			direction = 3;
			break;
		case 3:
			direction = 0;
			break;
		}
		updateNextPos();
	}
}
