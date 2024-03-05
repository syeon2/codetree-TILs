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

        boolean flag = true;

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                if (list[i][1] < list[k][0] || list[i][0] > list[k][1]) {
                    flag = false;
                }
            }
        }

        if (flag) System.out.print("Yes");
        else System.out.print("No");
    }
}