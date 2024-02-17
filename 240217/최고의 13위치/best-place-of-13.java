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

        int max = 0;
        for (int i = 0; i < N; i++) {

            for (int k = 0; k < N - 2; k++) {
                int temp = 0;

                for (int j = k; j < k + 3; j++) {
                    temp += board[i][j];
                }

                if (max < temp) max = temp;
            }
        }

        System.out.print(max);
    }
}