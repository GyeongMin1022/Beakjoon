import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0, a = 0, b = 0, c = -1;
		int num = scan.nextInt();
		int save = num;
		while (save != c) {
			c = 0;
			if (num < 10) {
				b = num;
				c = b * 10 + b;
			} else {
				a = num / 10;
				b = num % 10;
				if (a + b >= 10) {
					c = b * 10 + (a + b - 10);
				} else {
					c = b * 10 + (a + b);
				}
			}
			count++;
			num = c;
		}
		System.out.println(count);
	}
}