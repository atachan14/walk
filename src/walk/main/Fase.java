package walk.main;

public class Fase {
WPM wpm;
	
	public Fase(WPM wpm) {
		this.wpm=wpm;
	}
	public void start() {
		System.out.println("--------------------");
		System.out.println();
		System.out.println();
		System.out.println("　目が覚めたら夜だった");
		System.out.println("　　おうちに帰らなきゃ");
		System.out.println();
		System.out.println();
	}

	public void walk() {
		System.out.println("--------------------");
		System.out.println();
		System.out.println();
		System.out.println("　now walking");
		System.out.println("　　");
		System.out.println();
		System.out.println();
	}

	public void overDisplay() {
		System.out.println("---------------------");
		System.out.println();
		System.out.println();
		getHereMesse();
		getNextMesse();
		searchOtherMesse();
		System.out.println();
		System.out.println();
	}
	
	public void underDisplay() {
		
	}
}