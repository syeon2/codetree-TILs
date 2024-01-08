import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] list = new int[n][m];

        int cnt = 1;
        
        int x = 0;
        int y = 0;

        int memoX = x;
        int memoY = y;

        while (!(x == m - 1 && y == n - 1)) {
            list[y++][x--] = cnt++;

            if ((x < 0 || y >= n) && memoX != m - 1) {
                y = 0;
                x = ++memoX;
            }

            if (y >= n && memoX == m - 1) {
                x = m - 1;
                y = ++memoY;
            }
        }

        list[n - 1][m - 1] = cnt;

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < m; k++) {

                System.out.printf("%d ", list[i][k]);
            }

            System.out.println();
        }
    }
}