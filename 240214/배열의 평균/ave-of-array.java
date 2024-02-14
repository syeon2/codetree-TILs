import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] list = new int[2][4];

        int total = 0;

        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 4; k++) {
                list[i][k] = sc.nextInt();

                total += list[i][k];
            }
        }

        // 가로 평균
        for (int i = 0; i < 2; i++) {

            int sum = 0;

            for (int k = 0; k < 4; k++) {
                sum += list[i][k];
            }

            System.out.printf("%.1f ", (double) sum / 4);
        }

        System.out.println();

        // 세로 평균
        for (int i = 0; i < 4; i++) {

            int sum = 0;

            for (int k = 0; k < 2; k++) {
                sum += list[k][i];
            }

            System.out.printf("%.1f ", (double) sum / 2);
        }

        System.out.println();

        // 전체 평균
        System.out.printf("%.1f", (double) total / 8);
    }
}