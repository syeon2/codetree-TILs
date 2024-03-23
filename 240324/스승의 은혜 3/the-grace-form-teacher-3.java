import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        int[][] list = new int[N][2];
        for (int i = 0; i < N; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        Arrays.sort(list, (a, b) -> {
            if (a[0] + a[1] == b[0] + b[1]) {
                return a[0] - b[0];
            }

            return (a[0] + a[1]) - (b[0] + b[1]);
        });

        int ans = 0;

        for (int i = 0; i < N; i++) {
            int temp = 0;

            for (int k = 0; k < N; k++) {
                if (i == k) temp += (list[k][0] / 2) + list[k][1];
                else temp += list[k][0] + list[k][1];

                if (temp <= B) ans = Math.max(ans, k + 1);
            }
        }

        System.out.print(ans);
    }
}