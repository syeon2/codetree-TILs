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

        boolean isAllCross = true;

        for (int i = 0; i < N; i++) {
            boolean flag = false;

            int x1 = list[i][0];
            int x2 = list[i][1];

            for (int k = 0; k < N; k++) {
                if (i == k) continue;
                
                int x3 = list[k][0];
                int x4 = list[k][1];

                if ((x1 <= x3 && x3 <= x2) || (x3 <= x1 && x4 >= x1)) flag = true;
            }

            if (!flag) isAllCross = false;
        }

        if (isAllCross) System.out.print("Yes");
        else System.out.print("No");
    }
}