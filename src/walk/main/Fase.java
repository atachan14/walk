package walk.main;

public class Fase extends Night {

	public Fase() {
	}

	public void start() {
		System.out.println("--------------------");
		System.out.println();
		System.out.println();
		System.out.println("　目が覚めたら夜だった");
		System.out.println("　　おうちに帰らなきゃ");
		System.out.println();
		System.out.println();
		new java.util.Scanner(System.in).nextLine();
	}

	public void walk() {
		System.out.println("--------------------");
		System.out.println("　now walking");
		new java.util.Scanner(System.in).nextLine();
	}

	public void overDisplay() {
		System.out.println("---------------------");
		System.out.println();
		System.out.println();
		getMapTop(p.getPos()).getHereMesse();
		getMapTop(p.getPos()).getNextMesse();
		//		searchOtherMesse();
		System.out.println();
		System.out.println();
	}

	public void underDisplay() {

	}

}