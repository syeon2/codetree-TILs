import java.util.*;

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
            int x1 = list[i][0];
            int x2 = list[i][1];

            boolean isCross = true;

            for (int k = 0; k < N; k++) {
                if (i == k) continue;
                
                int x3 = list[k][0];
                int x4 = list[k][1];

                if ((x1 < x3 && x2 < x4) || (x3 < x1 && x4 < x2)) continue;
                else isCross = false;
            }

            if (isCross) ans++;
        }

        System.out.print(ans);
    }
}