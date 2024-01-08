import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] list = new int[n][m];

        int cnt = 0;
        
        for (int i = 0; i < m; i++) {

            if (i % 2 == 0) {
                for (int k = 0; k < n; k++) {
                    list[k][i] = cnt++;
                }
            } else {
                for (int k = n - 1; k >= 0; k--) {
                    list[k][i] = cnt++;
                }
            }
        }

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < m; k++) {
                System.out.printf("%d ", list[i][k]);
            }

            System.out.println();
        }
    }
}