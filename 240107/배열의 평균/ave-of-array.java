import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] list = new int[2][4];

        double total = 0;

        for (int i = 0; i < 2; i++) {

            double sum = 0;

            for (int k = 0; k < 4; k++) {
                int n = sc.nextInt();

                list[i][k] = n;
                sum += n;
                total += n;
            }

            System.out.printf("%.1f ", sum / 4);
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {

            double sum = 0;

            for (int k = 0; k < 2; k++) {
                sum += list[k][i];
            }

            System.out.printf("%.1f ", sum / 2);
        }

        System.out.println();

        System.out.printf("%.1f ", total / 8);
    }
}