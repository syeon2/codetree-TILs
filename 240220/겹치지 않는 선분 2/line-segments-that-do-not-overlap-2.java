import java.util.Scanner;

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

        int cnt = 0;

        for (int i = 0; i < N; i++) {

            int x1 = list[i][0];
            int x2 = list[i][1];

            boolean flag = true;
            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                int x3 = list[k][0];
                int x4 = list[k][1];

                if ((x1 < x3 && x2 < x4) || (x3 < x1 && x4 < x2)) continue;
                else {
                    flag = false;
                    break;
                }
            }

            if (flag) cnt++;
        }

        System.out.print(cnt);
    }
}