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
            for (int k = 0; k < N; k++) {
                int x = k;
                int y = i;

                int move = 0;

                while (move <= N) {
                    int cost = (move * move) + ((move + 1) * (move + 1));
                    int gold = 0;

                    for (int j = 0; j < N; j++) {
                        for (int l = 0; l < N; l++) {
                            int nx = l;
                            int ny = j;

                            if (Math.abs(nx - x) + Math.abs(ny - y) <= move) {
                                if (board[j][l] == 1) gold++;
                            }
                        }
                    }

                    int totalCost = (gold * M) - cost;

                    if (totalCost >= 0) {
                        ans = Math.max(ans, gold);
                    }

                    move++;
                }
            }
        }

        System.out.print(ans);
    }
}