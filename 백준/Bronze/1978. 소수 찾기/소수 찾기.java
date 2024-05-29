import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];
        int i, j, count = 0, result = 0;

        // 숫자 입력 받기
        for (i = 0; i < n; i++) {
            int num = in.nextInt();
            arr[i] = num;
        }

        // 소수 찾기
        for (i = 0; i < n; i++) {
            count = 0;
            for (j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) { // 소수인 경우
                result++;
            }
        }

        System.out.println(result);
    }
}