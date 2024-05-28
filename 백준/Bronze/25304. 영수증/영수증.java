import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int arr1[] = new int[b];
		int arr2[] = new int[b];
		int sum = 0;
		
		for(int i=0;i<b;i++) {
			int c= in.nextInt();
			int d = in.nextInt();
			arr1[i] = c;
			arr2[i] = d;
					
		}
		
		for(int i=0; i<b; i++) {
			sum += arr1[i] * arr2[i];
		}
		if(sum == a){
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}
		

	}
}