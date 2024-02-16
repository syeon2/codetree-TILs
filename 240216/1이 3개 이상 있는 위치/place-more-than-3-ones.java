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

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                int temp = 0;

                if (i - 1 >= 0 && board[i - 1][k] == 1) temp++;
                if (i + 1 < N && board[i + 1][k] == 1) temp++;
                if (k - 1 >= 0 && board[i][k - 1] == 1) temp++;
                if (k + 1 < N && board[i][k + 1] == 1) temp++;

                if (temp >= 3) cnt++;
            }
        }

        System.out.print(cnt);
    }
}