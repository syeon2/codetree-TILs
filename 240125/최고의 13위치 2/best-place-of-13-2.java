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

        for (int i1 = 0; i1 < N; i1++) {

            for (int k1 = 0; k1 < N - 2; k1++) {

                int temp = 0;
                for (int j1 = k1; j1 < k1 + 3; j1++) {
                    temp += board[i1][j1];
                }

                for (int i2 = 0; i2 < N; i2++) {

                    for (int k2 = 0; k2 < N - 2; k2++) {

                        int temp2 = 0;
                        boolean flag = false;

                        for (int j2 = k2; j2 < k2 + 3; j2++) {
                            if (i1 == i2 && (j2 >= k1 && j2 <= k1 + 2)) {
                                flag = true;
                                break;
                            }

                            temp2 += board[i2][j2];
                        }

                        if (!flag) {
                            if (max < temp + temp2) max = temp + temp2;
                        }
                    }
                }
            }
        }

        System.out.print(max);
    }
}