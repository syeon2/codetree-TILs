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
        // 중첩되는지 확인
        for (int y1 = 0; y1 < N; y1++) {
            for (int x1 = 0; x1 < N - 2; x1++) {

                for (int y2 = 0; y2 < N; y2++) {
                    for (int x2 = 0; x2 < N - 2; x2++) {
                        if (y1 == y2) {
                            if (x1 == x2 || x1 == x2 + 1 || x1 == x2 + 2 || x2 + 2 == x1 || x2 + 1 == x1) continue;
                            else {
                                int temp = board[y1][x1] + board[y1][x1 + 1] + board[y1][x1 + 2] + board[y2][x2] + board[y2][x2 + 1] + board[y2][x2 + 2];

                                ans = Math.max(ans, temp);    
                            }
                        } else {
                            int temp = board[y1][x1] + board[y1][x1 + 1] + board[y1][x1 + 2] + board[y2][x2] + board[y2][x2 + 1] + board[y2][x2 + 2];

                            ans = Math.max(ans, temp);
                        }
                    }
                }
            }
        }

        System.out.print(ans);
    }
}