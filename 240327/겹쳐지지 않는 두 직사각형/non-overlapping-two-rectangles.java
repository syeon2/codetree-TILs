import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = -1001;

        for (int y1 = 0; y1 < N; y1++) {
            for (int x1 = 0; x1 < M; x1++) {

                for (int y2 = y1; y2 < N; y2++) {
                    for (int x2 = x1; x2 < M; x2++) {

                        for (int b1 = 0; b1 < N; b1++) {
                            for (int a1 = 0; a1 < M; a1++) {

                                for (int b2 = b1; b2 < N; b2++) {
                                    for (int a2 = a1; a2 < M; a2++) {

                                        if (x2 < a1 || a2 < x1 || y2 < b1 || b2 < y1) {

                                            int sum1 = 0;
                                            for (int i = y1; i <= y2; i++) {
                                                for (int k = x1; k <= x2; k++) {
                                                    sum1 += board[i][k];
                                                }
                                            }

                                            int sum2 = 0;
                                            for (int i = b1; i <= b2; i++) {
                                                for (int k = a1; k <= a2; k++) {
                                                    sum2 += board[i][k];
                                                }
                                            }

                                            ans = Math.max(ans, sum1 + sum2);
                                        }
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
}