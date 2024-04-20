import java.util.*;

public class Main {

    public static int N;

    public static String ans = "";

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        if (N == 2) System.out.print(45);
        else {
            perm("", 0);

            System.out.print(ans);
        }
    }

    public static void perm(String str, int depth) {
        if (!ans.isEmpty()) return;
        else if (depth == N) {
            ans = str;

            return;
        }

        for (int i = 1; i <= str.length() / 2; i++) {
            String a = str.substring(str.length() - (i * 2), str.length() - i);
            String b = str.substring(str.length() - i);

            if (a.equals(b)) return;
        }

        for (int i = 4; i <= 6; i++) {
            perm(str + i, depth + 1);
        }
    }
}