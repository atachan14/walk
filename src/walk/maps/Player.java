package walk.maps;

public class Player extends TileRider {

	int direction = 2;
	Pos nextPos = new Pos(0, 0);

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
		return nextPos.y;
	}

	public int getNextx() {
		return nextPos.x;
	}

	public void updateNextPos() {
		System.out.println("y" + pos.gety() + ",x" + pos.getx());
		System.out.println("nexty" + nextPos.gety() + ",nextx" + nextPos.getx());
		System.out.println("direction" + direction);

		switch (direction) {
		case 0:
			nextPos.y = pos.y + 1;
			nextPos.x = pos.x;
			break;
		case 1:
			nextPos.y = pos.y;
			nextPos.x = pos.x - 1;
			break;
		case 2:
			nextPos.y = pos.y - 1;
			nextPos.x = pos.x;
			break;
		case 3:
			nextPos.y = pos.y;
			nextPos.x = pos.x + 1;
			break;
		default:
			System.out.println("updateNextPosバグ");
			break;
		}
		System.out.println("idougo");
		System.out.println("y" + pos.y + ",x" + pos.x);
		System.out.println("nexty" + nextPos.y + ",nextx" + nextPos.x);
		System.out.println("direction" + direction);

		nextPos.y = MapTools.edgeOverExe(nextPos.y);
		nextPos.x = MapTools.edgeOverExe(nextPos.x);
		nextPos.setyx(nextPos.y, nextPos.x);
	}

	public void moveForward() {
		sety(nextPos.y);
		setx(nextPos.x);
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
