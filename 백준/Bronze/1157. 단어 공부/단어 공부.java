import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int[] count = new int[26];
		int max = -1;
		int same = 0;
		int index = 0;
		
		// 배열을 0으로 초기화
		for(int i=0; i<count.length;i++) {
			count[i] = 0;
		}
		
		// 알파벳 갯수 찾기
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'a') {
				count[str.charAt(i)-'a']++;
			} else {
				count[str.charAt(i)-'A']++;
			}
			
		}
		
		//가장 많은 알파벳 찾기
		for(int i=0; i<count.length;i++) {
			if(count[i] > max) {
				max = count[i];
				index = i;
				same = 0;
			} else if(count[i] == max) {
				same = 1;
			}
		}
		
		// 가장많은 알파벳갯수와 동일한게 있는지 찾기
		for(int i=0; i<count.length;i++) {

		}
		
		// 가장 많은 알파벳 출력, 여러개일경우 ? 출력
		if(same == 0) {
			System.out.printf("%c",'A'+index);
		} else {
			System.out.println("?");
		}
		

	}
}
