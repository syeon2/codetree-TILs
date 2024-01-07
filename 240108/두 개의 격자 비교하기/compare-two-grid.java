import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] list = new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int k = 0; k < n; k++) {
                int num = sc.nextInt();

                list[i][k] = num;
            }
        }

        for (int i = 0; i < m; i++) {

            for (int k = 0; k < n; k++) {
                int num = sc.nextInt();

                if (list[i][k] == num) System.out.print("0 ");
                else System.out.print("1 ");
            }

            System.out.println();
        }
    }
}