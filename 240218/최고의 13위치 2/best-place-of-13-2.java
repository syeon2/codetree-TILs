import java.util.Scanner;

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

        int ans = 0;
        for (int i = 0; i < N; i++) {

            for (int k = 0; k < N - 2; k++) {

                for (int y = 0; y < N; y++) {

                    for (int x = 0; x < N - 2; x++) {
                        if (i == k) {
                            if (k == x || k + 1 == x || k + 2 == x || k == x + 2 || k + 1 == x + 2 || k + 2 == x + 2) continue;
                            else {
                                int temp = 0;

                                for (int a = k; a < k + 3; a++) {
                                    temp += board[i][a];
                                }

                                for (int a = x; a < x + 3; a++) {
                                    temp += board[i][a];
                                }

                                ans = Math.max(ans, temp);
                            }
                        } else {
                            int temp = 0;

                            for (int a = k; a < k + 3; a++) {
                                temp += board[i][a];
                            }

                            for (int a = x; a < x + 3; a++) {
                                temp += board[y][a];
                            }

                            ans = Math.max(ans, temp);
                        }
                    }
                }
            }
        }

        System.out.print(ans);
    }
}