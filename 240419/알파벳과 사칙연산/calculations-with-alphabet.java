import java.util.*;

public class Main {

    public static int[] alp = new int[6];

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
            renewAns();
            return;
        }

        for (int i = 1; i <= 4; i++) {
            alp[depth] = i;
            perm(depth + 1);
        }
    }

    public static void renewAns() {
        int idx = 1;
        
        long temp = alp[str.charAt(0) - 'a'];

        while (idx < str.length()) {
            char cmd = str.charAt(idx);
            int nextNum = alp[str.charAt(idx + 1) - 'a'];

            if (cmd == '+') temp += nextNum;
            else if (cmd == '-') temp -= nextNum;
            else temp *= nextNum;

            idx += 2;
        }

        ans = Math.max(ans, temp);
    }
}