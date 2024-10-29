package walk.main;

public class Player extends InTile {
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
	}

	public Player(int y, int x) {
		super(y, x);
		this.direction = new java.util.Random().nextInt(4);
	}

	public void updateNextPos() {
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
	}

	public void moveForward() {
		pos = nextPos;
		updateNextPos();	
	}
	
	public void dcLeft() {
		switch (direction) {
		case 0:
			direction = 3;
			break;
		case 1:
			direction = 2;
			break;
		case 2:
			direction = 1;
			break;
		case 3:
			direction = 0;
			break;
		}
	}
	
	public void dcRight() {
		switch (direction) {
		case 0:
			direction = 1;
			break;
		case 1:
			direction = 0;
			break;
		case 2:
			direction = 3;
			break;
		case 3:
			direction = 2;
			break;
		}
	}
}
