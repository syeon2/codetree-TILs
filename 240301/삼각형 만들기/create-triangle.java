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

            for (int k = i + 1; k < N; k++) {

                for (int j = k + 1; j < N; j++) {
                    if (isRightAngle(list[i], list[k], list[j])) {
                        int maxX = Math.max(list[i][0], Math.max(list[k][0], list[j][0]));
                        int minX = Math.min(list[i][0], Math.max(list[k][0], list[j][0]));

                        int maxY = Math.max(list[i][1], Math.max(list[k][1], list[j][1]));
                        int minY = Math.min(list[i][1], Math.max(list[k][1], list[j][1]));

                        int width = maxX - minX;
                        int height = maxY - minY;

                        ans = Math.max(ans, width * height);
                    }
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isRightAngle(int[] a, int[] b, int[] c) {
        if (a[0] == b[0] && a[1] == c[1]) return true;
        else if (a[0] == c[0] && a[1] == b[1]) return true;
        else if (b[0] == a[0] && b[1] == c[1]) return true;
        else if (b[0] == c[0] && b[1] == a[1]) return true;
        else if (c[0] == a[0] && c[1] == b[1]) return true;
        else if (c[0] == b[0] && c[1] == a[1]) return true;

        return false;
    }
}