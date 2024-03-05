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
            for (int k = 0; k < N; k++) {
                if (i == k) continue;
                
                int x1 = list[i][0];
                int x2 = list[i][1];

                int x3 = list[k][0];
                int x4 = list[k][1];

                if (x2 >= x3 || x4 >= x1) {
                    ans++;
                    break;
                }
            }
        }

        if (ans == N) System.out.print("Yes");
        else System.out.print("No");
    }
}