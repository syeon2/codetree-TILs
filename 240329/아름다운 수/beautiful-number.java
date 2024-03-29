import java.util.*;

public class Main {

    public static int[] list = {1, 22, 333, 4444};
    public static int ans = 0;
    public static int N;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        recur("");

        System.out.print(ans);
    }

    public static void recur(String str) {
        if (str.length() > N) return;
        else if (str.length() == N) {
            ans++;
            return;
        }

        for (int i = 0; i < 4; i++) {
            recur(str + list[i]);
        }
    }
}