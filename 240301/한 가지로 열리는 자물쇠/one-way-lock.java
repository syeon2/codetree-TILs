import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[3];
        for (int i = 0; i < 3; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= N; k++) {
                for (int j = 1; j <= N; j++) {

                    if (Math.abs(i - list[0]) <= 2 || Math.abs(k - list[1]) <= 2 || Math.abs(j - list[2]) <= 2) ans++;
                }
            }
        }

        System.out.print(ans);
    }
}