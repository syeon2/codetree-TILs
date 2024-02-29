import java.util.*;

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

        int minAns = Integer.MAX_VALUE;

        for (int i = 1; i < N - 1; i++) {

            int dist = 0;
            for (int k = 1; k < N; k++) {
                if (k == i) continue;

                if (k == i + 1) {
                    dist += Math.abs(list[k - 2][0] - list[k][0]) + Math.abs(list[k - 2][1] - list[k][1]);
                } else {
                    dist += Math.abs(list[k - 1][0] - list[k][0]) + Math.abs(list[k - 1][1] - list[k][1]);
                }
            }

            if (minAns > dist) minAns = dist;
        }

        System.out.print(minAns);
    }
}