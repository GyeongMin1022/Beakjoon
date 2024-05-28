import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];
		int result = 0;

		for (int i = 0; i < 5; i++) {
			int a = in.nextInt();
			if (a < 40)
				a = 40;
			arr[i] = a;
			result += arr[i];
		}
		System.out.println(result/5);
	}
}