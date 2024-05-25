import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int i, j, k;
		for (i = 1; i <= a; i++) {
			for (k = a; k > i; k--) {
				System.out.print(" ");
			}
			
			for (j = 0; j < i; j++) {

				System.out.print("*");

			}
			
			System.out.println();
		}
	}
}
