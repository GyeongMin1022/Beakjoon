import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt(); // 테스트 케이스 수

        for (int i = 0; i < C; i++) {
            int N = scan.nextInt(); // 학생 수
            double[] scores = new double[N];
            double sum = 0;

            // 점수 입력 받기
            for (int j = 0; j < N; j++) {
                scores[j] = scan.nextDouble();
                sum += scores[j];
            }

            double average = sum / N;
            int aboveAverage = 0;

            // 평균 이상인 학생 수 세기
            for (double score : scores) {
                if (score > average) {
                    aboveAverage++;
                }
            }

            double ratio = (double) aboveAverage / N * 100;
            System.out.printf("%.3f%%\n", ratio);
        }
    }
}