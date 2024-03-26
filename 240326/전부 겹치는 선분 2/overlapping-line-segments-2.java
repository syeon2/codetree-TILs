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

        boolean possible = false;

        for (int i = 0; i < N; i++) {
            int minX = 0;
            int maxX = 101;

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                minX = Math.max(minX, list[k][0]);
                maxX = Math.min(maxX, list[k][1]);
            }

            if (minX <= maxX) possible = true;
        }

        if (possible) System.out.print("Yes");
        else System.out.print("No");
    }
}