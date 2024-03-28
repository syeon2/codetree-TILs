import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int K;

    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        while (true) {
            boolean explosion = false;

            for (int c = 0; c < N; c++) {
                int prevValue = -1;
                int prevIdx = N;

                for (int r = 0; r < N; r++) {
                    if (board[r][c] == 0) continue;

                    if (prevValue == -1) {
                        prevValue = board[r][c];
                        prevIdx = r;
                    } else {
                        if (prevValue == board[r][c]) continue;
                        else {
                            if ((r - 1) - prevIdx + 1 >= M) {
                                for (int i = prevIdx; i < r; i++) {
                                    board[i][c] = 0;
                                }

                                explosion = true;
                            }

                            prevValue = board[r][c];
                            prevIdx = r;
                        }
                    }
                }

                if ((N - 1) - prevIdx + 1 >= M) {
                    for (int i = prevIdx; i < N; i++) {
                        board[i][c] = 0;
                    }

                    explosion = true;
                }
            }

            if (explosion) {
                drop();
            } else {
                turn();
                drop();

                if (K == 0) break;

                K--;
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (board[i][k] != 0) ans++;
            }
        }

        System.out.print(ans);
    }

    public static void turn() {
        int[][] copy = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                int turnX = Math.abs((N - 1) - i);
                int turnY = k;

                copy[turnY][turnX] = board[i][k];
            }
        }

        board = copy;
    }

    public static void drop() {
        for (int c = 0; c < N; c++) {
            for (int r = N - 1; r >= 0; r--) {
                if (board[r][c] != 0) continue;

                for (int i = r - 1; i >= 0; i--) {
                    if (board[i][c] == 0) continue;

                    board[r][c] = board[i][c];
                    board[i][c] = 0;
                    break;
                }
            }
        }
    }
}