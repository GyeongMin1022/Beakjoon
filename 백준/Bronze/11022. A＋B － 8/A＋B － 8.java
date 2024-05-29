import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int i;

		for (i = 0; i < a; i++) {
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i + 1, n1, n2, n1 + n2);
		}

	}
}