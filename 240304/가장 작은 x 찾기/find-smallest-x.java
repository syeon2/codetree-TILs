import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] range = new int[N][2];

        for (int i = 0; i < N; i++) {
            range[i][0] = sc.nextInt();
            range[i][1] = sc.nextInt();
        }

        int x = 1;

        while (true) {
            boolean flag = true;

            int multiply = 1;
            for (int i = 0; i < N; i++) {
                multiply *= 2;

                int a = range[i][0];
                int b = range[i][1];

                if (!(x * multiply >= a && x * multiply <= b)) {
                    flag = false;
                    x++;
                    break;
                }
            }

            if (flag) break;
        }

        System.out.print(x);
    }
}