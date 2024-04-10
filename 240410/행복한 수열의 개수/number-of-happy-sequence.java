import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            int value = 0;

            for (int k = 0; k < N; k++) {
                if (board[i][k] == value) cnt++;
                else {
                    value = board[i][k];
                    cnt = 1;
                }

                if (cnt == M) {
                    ans++;
                    break;
                }
            }

            cnt = 0;
            value = 0;

            for (int k = 0; k < N; k++) {
                if (board[k][i] == value) cnt++;
                else {
                    value = board[k][i];
                    cnt = 1;
                }

                if (cnt == M) {
                    ans++;
                    break;
                }
            }
        }

        System.out.print(ans);
    }
}