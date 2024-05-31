import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] burger = new int[3];
		int[] drink = new int[2];

		for (int i = 0; i < 3; i++) {
			int a = scan.nextInt();
			burger[i] = a;
		}
		for (int i = 0; i < 2; i++) {
			int b = scan.nextInt();
			drink[i] = b;
		}

		int minb = burger[0];
		int mind = drink[0];

		for (int i = 0; i < 3; i++) {
			if (minb > burger[i]) {
				minb = burger[i];
			}
		}
		for (int i = 0; i < 2; i++) {
			if (mind > drink[i]) {
				mind = drink[i];
			}
		}
		System.out.println((minb + mind - 50));

	}
}