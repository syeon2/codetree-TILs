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
            boolean isPossible = false;

            int value = 0;
            int cnt = 1;

            for (int k = 0; k < N; k++) {
                if (cnt == M) isPossible = true;

                if (k == 0) value = board[i][k];
                else {
                    if (value == board[i][k]) cnt++;
                    else {
                        value = board[i][k];
                        cnt = 1;
                    }
                }
            }

            if (cnt >= M) isPossible = true;
            if (isPossible) ans++;
        }

        for (int i = 0; i < N; i++) {
            boolean isPossible = false;

            int value = 0;
            int cnt = 1;

            for (int k = 0; k < N; k++) {
                if (cnt == M) isPossible = true;

                if (k == 0) value = board[k][i];
                else {
                    if (value == board[k][i]) cnt++;
                    else {
                        value = board[k][i];
                        cnt = 1;
                    }
                }
            }

            if (cnt >= M) isPossible = true;
            if (isPossible) ans++;
        }

        System.out.print(ans);
    }
}