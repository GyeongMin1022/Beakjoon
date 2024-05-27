import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int b1 = b/100 * 100;
		int b2 = (b-b1) /10 * 10;
		int b3 = b-b1-b2;
		System.out.println(a*b3);
		System.out.println(a*b2 /10);
		System.out.println(a*b1 /100);
		System.out.println(a*b);
		

	}

}