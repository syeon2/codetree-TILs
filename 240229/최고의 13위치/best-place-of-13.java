import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int maxAns = 0;
        for (int i = 0; i < N; i++) {

            for (int k = 0; k <= N - 3; k++) {

                int tempSum = 0;
                for (int j = k; j < k + 3; j++) {
                    if (board[i][j] == 1) tempSum++;
                }

                if (maxAns < tempSum) maxAns = tempSum;
            }
        }

        System.out.print(maxAns);
    }
}