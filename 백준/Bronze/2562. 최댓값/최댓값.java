import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		int a = scan.nextInt();
		int[] num = new int[9];
		
		int i, where=0, max=0;
		
		for(i=0;i<9;i++) {
			int n = scan.nextInt();
			num[i] = n;
			
			if(num[i]>max) {
				max = num[i];
				where = i+1;
			}
		
		}
		System.out.println(max);
		System.out.println(where);
		
		scan.close();
		

	
	}
}