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

        int ans = 0;
        for (int i = 0; i < N; i++) {

            boolean[] time = new boolean[1001];
            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                int start = list[k][0];
                int end = list[k][1];

                for (int l = start; l < end; l++) {
                    time[l] = true;
                }
            }

            int cnt = 0;
            for (int k = 0; k < time.length; k++) {
                if (time[k]) cnt++;
            }

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}