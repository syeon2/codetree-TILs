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
                    int[] line = new int[101];

                    for (int x = 0; x < N; x++) {
                        if (x == i || x == k || x == j) continue;

                        int start = list[x][0];
                        int end = list[x][1];

                        for (int s = start; s <= end; s++) {
                            line[s]++;
                        }
                    }

                    boolean flag = true;

                    for (int s = 0; s < line.length; s++) {
                        if (line[s] > 1) flag = false;
                    }

                    if (flag) ans++;
                }
            }
        }

        System.out.print(ans);
    }
}