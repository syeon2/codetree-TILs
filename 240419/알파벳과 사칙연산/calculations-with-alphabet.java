import java.util.*;

public class Main {

    public static int[] memo = new int[6];
    public static String str;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        str = sc.next();

        perm(0);

        System.out.print(ans);
    }

    public static void perm(int depth) {
        if (depth == 6) {
            check();
            return;
        }

        for (int i = 1; i <= 4; i++) {
            memo[depth] = i;
            perm(depth + 1);
        }
    }

    public static void check() {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                int idx = str.charAt(0) - 'a';

                result = memo[idx];
            } else {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') continue;
                else {
                    int idx = str.charAt(i + 1) - 'a';

                    if (str.charAt(i) == '+') {
                        result += memo[idx];
                        i++;
                    } else if (str.charAt(i) == '-') {
                        result -= memo[idx];
                        i++;
                    } else {
                        result *= memo[idx];
                        i++;
                    }
                }
            }
        }

        ans = Math.max(ans, result);
    }
}