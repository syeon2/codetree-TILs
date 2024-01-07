import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] list = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {

            for (int k = 1; k <= N; k++) {

                if (i == 1 || k == 1) list[i][k] = 1;
                else {
                    list[i][k] = list[i - 1][k - 1] + list[i][k - 1] + list[i - 1][k];
                }

                System.out.printf("%d ", list[i][k]);
            }

            System.out.println();
        }
    }
}