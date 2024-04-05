import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int total = 0;

        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();

            total += list[i];
        }

        if (total % 2 == 1) System.out.print("No");
        else {
            int[] memo = new int[(total / 2) + 1];
            Arrays.fill(memo, -1);
            memo[0] = 0;

            for (int i = 0; i < N - 1; i++) {

                for (int k = memo.length - 1; k >= 0; k--) {
                    if (k >= list[i] && memo[k - list[i]] != -1) {
                        memo[k] = Math.max(memo[k], memo[k - list[i]] + 1);
                    }
                }
            }

            if (memo[memo.length - 1] == -1) System.out.print("No");
            else System.out.print("Yes");
        }
    }
}