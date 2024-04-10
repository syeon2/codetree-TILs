import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = Integer.MIN_VALUE;

        for (int y1 = 0; y1 < N; y1++) {
            for (int x1 = 0; x1 < M; x1++) {

                for (int y2 = y1; y2 < N; y2++) {
                    for (int x2 = x1; x2 < M; x2++) {

                        for (int b1 = 0; b1 < N; b1++) {
                            for (int a1 = 0; a1 < M; a1++) {

                                for (int b2 = b1; b2 < N; b2++) {
                                    for (int a2 = a1; a2 < M; a2++) {
                                        if (!isNotCross(x1, y1, x2, y2, a1, b1, a2, b2)) continue;

                                        int sum = 0;

                                        for (int i = y1; i <= y2; i++) {
                                            for (int k = x1; k <= x2; k++) {
                                                sum += board[i][k];
                                            }
                                        }

                                        for (int i = b1; i <= b2; i++) {
                                            for (int k = a1; k <= a2; k++) {
                                                sum += board[i][k];
                                            }
                                        }

                                        ans = Math.max(ans, sum);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isNotCross(int x1, int y1, int x2, int y2, int a1, int b1, int a2, int b2) {
        if (x2 < a1 || a2 < x1 || y2 < b1 || b2 < y1) return true;

        return false;
    }
}