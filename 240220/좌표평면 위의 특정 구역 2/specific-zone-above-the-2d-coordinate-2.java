import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int ansX = Integer.MAX_VALUE;
        int ansY = Integer.MAX_VALUE;

        int[][] list = new int[N][2];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            list[i][0] = x;
            list[i][1] = y;
        }

        for (int i = 0; i < N; i++) {

            int maxX = 0;
            int maxY = 0;

            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                int x = list[k][0];
                int y = list[k][1];

                if (maxX < x) maxX = x;
                if (maxY < y) maxY = y;
                if (minX > x) minX = x;
                if (minY > y) minY = y;
            }

            if (ansX > (maxX - minX)) ansX = maxX - minX;
            if (ansY > (maxY - minY)) ansY = maxY - minY;
        }

        int ans = ansX * ansY;

        System.out.print(ans);
    }
}