import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] board = new int[N + 2][N + 2];

        for (int i = 1; i <= N; i++) {

            int num = sc.nextInt();

            for (int k = 1; k <= N; k++) {
                board[i][k] = num;
            }
        }

        int ans = 0;

        for (int i = 1; i <= N; i++) {
            int cnt = 0;

            for (int k = 1; k <= N; k++) {

                if (board[i - 1][k] == 1) cnt++;
                if (board[i + 1][k] == 1) cnt++;
                if (board[i][k - 1] == 1) cnt++;
                if (board[i][k + 1] == 1) cnt++;
            }

            if (cnt >= 3) ans++;
        }

        System.out.print(ans);
    }
}