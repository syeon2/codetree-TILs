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

        int ans = 0;

        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                int tempSum1 = board[y][x];

                int tempX1 = x - 1;
                int tempY1 = y - 1;

                while (isRange(tempX1, tempY1, N)) {
                    tempSum1 += board[tempY1][tempX1];

                    int tempX2 = tempX1 - 1;
                    int tempY2 = tempY1 + 1;

                    int tempSum2 = tempSum1;

                    while (isRange(tempX2, tempY2, N)) {
                        tempSum2 += board[tempY2][tempX2];

                        int tempX3 = tempX2 + 1;
                        int tempY3 = tempY2 + 1;

                        int tempSum3 = tempSum2;

                        while (isRange(tempX3, tempY3, N)) {
                            tempSum3 += board[tempY3][tempX3];

                            int tempX4 = tempX3 + 1;
                            int tempY4 = tempY3 - 1;

                            int tempSum4 = tempSum3;

                            boolean flag = false;

                            while (isRange(tempX4, tempY4, N)) {
                                if (tempX4 == x && tempY4 == y) {
                                    flag = true;
                                    break;
                                }

                                tempSum4 += board[tempY4][tempX4];

                                tempX4 += 1;
                                tempY4 -= 1;
                            }

                            if (flag) ans = Math.max(ans, tempSum4);

                            tempX3++;
                            tempY3++;
                        }

                        tempX2--;
                        tempY2++;
                    }

                    tempX1 -= 1;
                    tempY1 -= 1;
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}