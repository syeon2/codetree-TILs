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

                    for (int l = 0; l < N; l++) {
                        if (i == l || k == l || j == l) continue;

                        int a = list[l][0];
                        int b = list[l][1];

                        for (int x = a; x <= b; x++) {
                            line[x]++;
                        }
                    }

                    boolean flag = true;
                    for (int l = 0; l < 101; l++) {
                        if (line[l] >= 2) flag = false;
                    }

                    if (flag) ans++;
                }
            }
        }

        System.out.print(ans);
    }
}