import java.util.*;

public class Main {
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

        int max = 0;
        for (int y1 = 0; y1 < N; y1++) {
            for (int x1 = 0; x1 < N - 2; x1++) {

                for (int y2 = 0; y2 < N; y2++) {
                    for (int x2 = 0; x2 < N - 2; x2++) {
                        if (y1 != y2) {
                            int temp = 0;

                            for (int i = x1; i < x1 + 3; i++) {
                                if (board[y1][i] == 1) temp++;
                            }

                            for (int i = x2; i < x2 + 3; i++) {
                                if (board[y2][i] == 1) temp++;
                            }

                            if (temp > max) max = temp;
                        } else {
                            int temp = 0;

                            if (x2 < x1 - 2 || x2 > x1 + 2) {
                                for (int i = x1; i < x1 + 3; i++) {
                                    if (board[y1][i] == 1) temp++;
                                }

                                for (int i = x2; i < x2 + 3; i++) {
                                    if (board[y2][i] == 1) temp++;
                                }   
                            }

                            if (temp > max) max = temp;
                        }
                    }
                }
            }
        }

        System.out.print(max);
    }
}