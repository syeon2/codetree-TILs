import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        char[] list = new char[10001];

        for (int n = 0; n < N; n++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);

            list[pos] = c;
        }

        int ans = 0;
        for (int i = 0; i < list.length - K; i++) {
            int sum = 0;

            for (int k = i; k <= i + K; k++) {
                if (list[k] == 'G') sum++;
                else if (list[k] == 'H') sum += 2;
            }

            ans = Math.max(ans, sum);
        }

        System.out.print(ans);
    }
}