import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 2738 : 행렬덧셈
		Scanner scan = new Scanner(System.in);

		// 행렬크기 입력
		int a = scan.nextInt();
		int b = scan.nextInt();
		int arr1[][] = new int[a][b]; // 1번행렬 크기
		int arr2[][] = new int[a][b]; // 2번행렬 크기
		int arr3[][] = new int[a][b]; // 행렬 합 담는곳
		

		// 1번 행렬 입력
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				int a1 = scan.nextInt();
				arr1[i][j] = a1;
			}
		}

		// 2번 행렬 입력
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				int a2 = scan.nextInt();
				arr2[i][j] = a2;
			}
		}
		scan.close();
		// 행렬계산
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				arr3[i][j] =arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j] + " ");
				
			}
			System.out.println();
		}

		
		
	}

}