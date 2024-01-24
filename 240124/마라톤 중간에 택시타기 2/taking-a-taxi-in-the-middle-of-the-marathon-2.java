import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] list = new int[N][2];

        for (int i = 0; i < N; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < N - 1; i++) {

            int temp = 0;

            for (int k = 1; k < N; k++) {
                if (i == k) continue;

                if (i == k - 1) temp += Math.abs(list[k - 2][0] - list[k][0]) + Math.abs(list[k - 2][1] - list[k][1]);
                else temp += Math.abs(list[k - 1][0] - list[k][0]) + Math.abs(list[k - 1][1] - list[k][1]);
            }

            if (temp < min) min = temp;
        }

        System.out.print(min);
    }
}