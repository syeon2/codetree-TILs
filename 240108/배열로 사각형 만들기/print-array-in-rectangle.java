import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] list = new int[6][6];

        for (int i = 1; i <= 5; i++) {

            for (int k = 1; k <= 5; k++) {
                if (i == 1 || k == 1) list[i][k] = 1;
                else {
                    list[i][k] = list[i - 1][k] + list[i][k - 1];
                }

                System.out.printf("%d ", list[i][k]);
            }

            System.out.println();
        }
    }
}