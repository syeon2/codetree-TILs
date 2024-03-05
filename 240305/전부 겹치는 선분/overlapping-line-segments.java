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

        boolean ans = true;

        for (int i = 0; i < N; i++) {

            int tempX1 = list[i][0];
            int tempX2 = list[i][1];
            boolean flag = false;

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                int x3 = list[k][0];
                int x4 = list[k][1];

                if (tempX2 >= x3) {
                    tempX1 = Math.max(tempX1, x3);
                    tempX2 = Math.min(tempX2, x4);
                    flag = true;
                } else if (tempX1 >= x4) {
                    tempX1 = Math.max(tempX1, x3);
                    tempX2 = Math.min(tempX2, x4);
                    flag = true;
                }
            }

            if (!flag) {
                ans = false;
                break;
            }
        }

        if (ans) System.out.print("Yes");
        else System.out.print("No");
    }
}