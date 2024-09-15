import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];
        for (int r = 0; r < N; r++) {
            String[] str = br.readLine().split(" ");

            for (int c = 0; c < N; c++) {
                board[r][c] = Integer.parseInt(str[c]);
            }
        }

        int ans = 0;

        for (int y1 = 0; y1 < N; y1++) {
            for (int x1 = 0; x1 < N; x1++) {

                for (int y2 = 0; y2 < N; y2++) {
                    for (int x2 = 0; x2 < N; x2++) {
                        
                        int temp = 0;

                        if (isRange(x1 + 2, y1, N) && isRange(x2 + 2, y2, N) && !isOverlap(x1, y1, x2, y2)) {
                            for (int i = 0; i < 3; i++) {
                                temp += board[y1][x1 + i];
                                temp += board[y2][x2 + i];
                            }
                        }

                        ans = Math.max(ans, temp);
                    }
                }
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static boolean isOverlap(int x1, int y1, int x2, int y2) {
        if (y1 != y2) return false;

        if ((x1 <= x2 && x2 <= x1 + 2) || (x1 <= x2 + 2 && x2 + 2 <= x1 + 2)) return true;
        else if ((x2 <= x1 && x1 <= x2 + 2) || (x2 <= x1 + 2 && x1 + 2 <= x2 + 2)) return true;

        return false;
    }

    public static boolean isRange(int x, int y, int N) {
        return (x >= 0 && x < N && y >= 0 && y < N);
    }
}