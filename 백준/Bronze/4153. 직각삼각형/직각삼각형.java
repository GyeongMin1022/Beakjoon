import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if (a == 0 && b == 0 & c == 0)
				break;

			// c가 가장 클때
			if (c > b && c > a) {
				if (a * a + b * b == c * c) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			}
			// b가 가장 클 때
			else if(b>a && b>c) {
				if (a * a + c * c == b * b) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			}
			// a가 가장 클 때
				else {
					if (c * c + b * b == a * a) {
						System.out.println("right");
					} else {
						System.out.println("wrong");
					}
				}
			}
			

		} // while문 끝나는 곳

	}
