package walk.main;

public class Main {
	public static void main(String[] args) {
		title();

	}

	public static void title() {
		System.out.println();
		System.out.println("　　　walk");
		System.out.println();
		System.out.println("   　　　1.new play 2.continue ＞");
	}

	public void titleInput() {
		String input = new java.util.Scanner(System.in).nextLine();
		switch (input) {
		default:
			WPM wpm = new WPM(7);
			wpm.game();
			break;
		}
	}
}
