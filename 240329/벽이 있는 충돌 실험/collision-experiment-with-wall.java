import java.util.*;
import java.io.*;

public class Main {

    public static int[] dx = {0, 0, 0, -1, 1};
    public static int[] dy = {0, -1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[][] board = new int[N][N];
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());

                int R = Integer.parseInt(st.nextToken()) - 1;
                int C = Integer.parseInt(st.nextToken()) - 1;

                int direc = getDirec(st.nextToken().charAt(0));

                board[R][C] = direc;
            }

            int sec = 0;
            while (sec++ <= 2 * N) {

                int[][] memo = new int[N][N];
                int[][] memoCnt = new int[N][N];

                for (int i = 0; i < N; i++) {
                    for (int k = 0; k < N; k++) {
                        if (board[i][k] == 0) continue;

                        int direc = board[i][k];

                        int nx = k + dx[direc];
                        int ny = i + dy[direc];

                        if (isRange(nx, ny, N)) {
                            memoCnt[ny][nx]++;
                            memo[ny][nx] = direc;
                        } else {
                            memoCnt[i][k]++;
                            memo[i][k] = turnDirec(direc);
                        }
                    }
                }

                for (int i = 0; i < N; i++) {
                    for (int k = 0; k < N; k++) {
                        if (memo[i][k] != 0 && memoCnt[i][k] == 1) board[i][k] = memo[i][k];
                        else board[i][k] = 0;
                    }
                }
            }

            int ans = 0;
            for (int i = 0; i < N; i++) {
                for (int k = 0; k < N; k++) {
                    if (board[i][k] != 0) ans++;
                }
            }

            sb.append(ans).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int turnDirec(int direc) {
        if (direc == 1) return 2;
        else if (direc == 2) return 1;
        else if (direc == 3) return 4;
        else return 3;
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int getDirec(char direc) {
        if (direc == 'U') return 1;
        else if (direc == 'D') return 2;
        else if (direc == 'L') return 3;
        else return 4;
    }
}