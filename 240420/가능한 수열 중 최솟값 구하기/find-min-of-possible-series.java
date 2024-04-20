import java.util.*;

public class Main {

    public static int N;

    public static String ans = "";

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        perm("", 0);

        System.out.print(ans);
    }

    public static void perm(String str, int depth) {
        if (!ans.isEmpty()) return;
        else if (depth == N) {
            ans = str;

            return;
        }

        for (int k = 4; k <= 6; k++) {
            String temp = str + k;
            boolean flag = true;

            for (int i = 1; i <= temp.length() / 2; i++) {
                String a = temp.substring(temp.length() - (i * 2), temp.length() - i);
                String b = temp.substring(temp.length() - i);

                if (a.equals(b)) flag = false;
            }

            if (flag) perm(temp, depth + 1);
        }
    }
}