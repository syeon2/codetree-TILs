import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] list = new int[N][2];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            list[i][0] = x;
            list[i][1] = y;
        }

        int min = Integer.MAX_VALUE;
        // i가 건너뛰는 포인트
        for (int i = 1; i < N - 1; i++) {
            int temp = 0;

            for (int k = 1; k < N; k++) {
                if (k == i) continue;
                else if (k == i + 1) {
                    int diffX = Math.abs(list[k][0] - list[k - 2][0]);
                    int diffY = Math.abs(list[k][1] - list[k - 2][1]);

                    temp += (diffX + diffY);
                } else {
                    int diffX = Math.abs(list[k][0] - list[k - 1][0]);
                    int diffY = Math.abs(list[k][1] - list[k - 1][1]);

                    temp += (diffX + diffY);
                }
            }

            if (min > temp) min = temp;
        }

        System.out.print(min);
    }
}