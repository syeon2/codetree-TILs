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

        int x = 1;

        while (true) {
            int multi = 2;
            boolean isAllPass = true;

            for (int i = 0; i < N; i++) {
                int a = list[i][0];
                int b = list[i][1];

                int num = x * multi;

                if (a <= num && num <= b) {
                    multi *= 2;
                } else {
                    isAllPass = false;
                    break;
                }
            }

            if (isAllPass) break;
            else x++;
        }

        System.out.print(x);
    }
}