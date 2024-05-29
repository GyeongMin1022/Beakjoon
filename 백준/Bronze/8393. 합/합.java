import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int i, result = 0;

		for (i = 1; i <= a; i++) {
			result += i;
		}
		System.out.println(result);
		scan.close();
	}
}