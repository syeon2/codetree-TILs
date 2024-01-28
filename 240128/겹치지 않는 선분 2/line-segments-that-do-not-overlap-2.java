import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] list = new int[N][2];

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            list[i][0] = x1;
            list[i][1] = x2;
        }

        int ans = N;

        for (int i = 0; i < N; i++) {

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                int startX1 = Math.min(list[i][0], list[i][1]);
                int endX1 = Math.max(list[i][0], list[i][1]);

                int startX2 = Math.min(list[k][0], list[k][1]);
                int endX2 = Math.max(list[k][0], list[k][1]);

                if (startX1 <= startX2 && endX1 >= endX2) ans--;
                else if (startX1 >= startX2 && endX1 <= endX2) ans--;
            }
        }

        System.out.print(ans);
    }
}