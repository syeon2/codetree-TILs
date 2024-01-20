import java.util.Scanner;

public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

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

        int ans = 0;

        for (int i = 0; i < N; i++) {

            for (int k = 0; k < N; k++) {
                int cnt = 0;

                for (int j = 0; j < 4; j++) {
                    if ((i + dy[j] < 0 || i + dy[j] >= N) || (k + dx[j] < 0 || k + dx[j] >= N)) continue;
                    else {
                        if (board[i + dy[j]][k + dx[j]] == 1) cnt++;
                    }
                }

                if (cnt >= 3) ans++;
            }
        }

        System.out.print(ans);
    }
}