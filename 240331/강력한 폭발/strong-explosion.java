import java.util.*;
import java.io.*;

public class Main {

    public static int[][] board;
    public static int[][] memo;

    public static int N;
    public static int ans = 0;

    public static int[][] dx = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, -1}, {0, 1, 1, -1, -1}};
    public static int[][] dy = {{0, -2, -1, 1, 2}, {0, -1, 0, 1, 0}, {0, -1, 1, 1, -1}};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        memo = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int k = 0; k < N; k++) {
                board[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        recur();
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int getAns() {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (memo[i][k] >= 1) sum++;
            }
        }

        return sum;
    }

    public static void recur() {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (board[r][c] == 0) continue;

                board[r][c] = 0;

                for (int i = 0; i < 3; i++) {
                    for (int k = 0; k < 5; k++) {
                        int nx = c + dx[i][k];
                        int ny = r + dy[i][k];

                        if (isRange(nx, ny)) memo[ny][nx]++;
                    }

                    ans = Math.max(ans, getAns());
                    recur();

                    for (int k = 0; k < 5; k++) {
                        int nx = c + dx[i][k];
                        int ny = r + dy[i][k];

                        if (isRange(nx, ny)) memo[ny][nx]--;
                    }
                }

                board[r][c] = 1;
            }
        }
    }
}