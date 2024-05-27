import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int temp;
		int arr[] = new int[n];
		// 입력값 받기
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			arr[i] = a;
		}

		// 정렬
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(arr[j]>arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
				}
			}
		}
		
		// 출력
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}