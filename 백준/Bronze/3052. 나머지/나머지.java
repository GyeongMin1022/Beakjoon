import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];
		int arr2[] = new int[10];
		int i, j, count = 10;

		// 숫자 10개 입력받기
		for (i = 0; i < 10; i++) {
			int a = scan.nextInt();
			arr[i] = a;
		}
		scan.close();

		// 숫자 10개의 나머지
		for (i = 0; i < 10; i++) {
			arr2[i] = arr[i] % 42;
		}

		// 서로 다른 나머지 숫자 갯수
		for (i = 0; i < 10; i++) {
			for (j = i+1; j < 10; j++) {
				if (arr2[i] == arr2[j]) {
					count--;
					break;
				}
			}
		
				
			
		}
		System.out.println(count);

	
	
	}

}