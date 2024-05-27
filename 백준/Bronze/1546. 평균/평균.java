import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double arr[] = new double[n];
		double result = 0; 
		int max = 0;

		// 값 입력받기
		for (int i = 0; i < n; i++) {
			int n1 = scan.nextInt();
			arr[i] = n1;
		}
		scan.close();

		// 최대값 찾기
		for (int i = 0; i < n; i++) {
			if (arr[i] >= max) {
				max = (int)arr[i];
			}
		}
		// 계산식
		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i] / max) * 100;
			result = result + arr[i];
		}
		System.out.println(result / n);

	}

}