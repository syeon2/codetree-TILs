import java.util.*;

public class Main {

    public static int[][] pos = {{0, 0, 0}, {0, 0, 1}, {1, 1, 0}, {1, 1, 1}};

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
        for (int i = 0; i <= 10; i++) {
            for (int k = 0; k <= 10; k++) {
                for (int j = 0; j <= 10; j++) {

                    for (int l = 0; l < 4; l++) {
                        boolean[] isCovered = new boolean[N];

                        int first = pos[l][0];
                        int second = pos[l][1];
                        int third = pos[l][2];

                        for (int n = 0; n < N; n++) {
                            int x = list[n][0];
                            int y = list[n][1];

                            if (first == 0 && i == x) isCovered[n] = true;
                            else if (first == 1 && i == y) isCovered[n] = true;
                            else if (second == 0 && k == x) isCovered[n] = true;
                            else if (second == 1 && k == y) isCovered[n] = true;
                            else if (third == 0 && j == x) isCovered[n] = true;
                            else if (third == 1 && j == y) isCovered[n] = true;
                        }

                        boolean isAllCovered = true;
                        for (int n = 0; n < isCovered.length; n++) {
                            if (!isCovered[n]) isAllCovered = false;
                        }

                        if (isAllCovered) ans = 1;
                    }
                }
            }
        }

        System.out.print(ans);
    }
}