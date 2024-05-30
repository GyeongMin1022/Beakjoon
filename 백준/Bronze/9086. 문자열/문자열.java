import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
        scan.nextLine();  // 이전 nextInt에서 남은 줄 바꿈 문자를 소비

		for (int i = 0; i < a; i++) {
			String b = scan.nextLine();
			System.out.println(b.charAt(0) + "" + b.charAt(b.length() - 1));  // 마지막 문자를 가져오기 위해 length() - 1 사용
		}
	}
}