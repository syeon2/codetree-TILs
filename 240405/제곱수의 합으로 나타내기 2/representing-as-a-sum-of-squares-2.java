import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int ans = recur(N, 0);

        System.out.print(ans);
    }

    public static int recur(int n, int cnt) {
        if (n == 0) return cnt;
        else if (n < 0) return 100000;

        int sqrt = (int) Math.sqrt(n);

        int result = 100001;

        for (int i = 1; i <= sqrt; i++) {
            int num = i * i;

            result = Math.min(result, recur(n - num, cnt + 1));
        }

        return result;
    }
}