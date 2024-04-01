import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int[][] list;
    public static int[][] ansList = new int[2][2];

    public static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        list = new int[N][2];
        for (int i = 0; i < N; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        recur(0, 0);

        System.out.print(ans);
    }

    public static void recur(int idx, int depth) {
        if (depth == 2) {
            int sum = 0;

            sum = (Math.abs(ansList[0][0] - ansList[1][0]) * Math.abs(ansList[0][0] - ansList[1][0])) + (Math.abs(ansList[0][1] - ansList[1][1]) * Math.abs(ansList[0][1] - ansList[1][1]));

            ans = Math.min(ans, sum);
            return;
        }

        for (int i = idx; i < N; i++) {
            ansList[depth][0] = list[i][0];
            ansList[depth][1] = list[i][1];

            recur(i + 1, depth + 1);
        }
    }
}