import java.util.*;

public class Main {

    public static int N;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        recur("");

        System.out.print(ans);
    }

    public static void recur(String str) {
        if (str.length() == N) {
            for (int i = 0; i < str.length(); i += (str.charAt(i) - '0')) {

                int curValue = str.charAt(i) - '0';

                if (i + curValue > N) return;

                for (int k = i; k < i + curValue; k++) {
                    if (str.charAt(k) - '0' != curValue) return;
                }
            }

            ans++;
            return;
        }

        for (int i = 1; i <= 4; i++) {
            recur(str + String.valueOf(i));
        }
    }
}