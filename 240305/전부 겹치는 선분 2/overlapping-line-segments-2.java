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

        boolean ans = false;

        for (int i = 0; i < N; i++) {
            boolean flag = true;

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                for (int j = 0; j < N; j++) {
                    if (j == i) continue;

                    if (list[k][0] < list[j][1] && list[k][1] < list[j][0]) flag = false;
                    if (list[j][0] < list[k][1] && list[j][1] < list[k][0]) flag = false;
                }
            }

            if (flag) ans = true;
        }

        if (ans) System.out.print("Yes");
        else System.out.print("No");
    }
}