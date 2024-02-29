import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        char[] list = new char[10001];

        for (int i = 0; i < N; i++) {
            int idx = sc.nextInt();
            char c = sc.next().charAt(0);

            list[idx] = c;
        }

        int max = 0;
        for (int i = 0; i < list.length - K; i++) {

            int score = 0;
            for (int k = i; k <= i + K; k++) {
                if (list[k] == 'G') score += 1;
                else if (list[k] == 'H') score += 2;
            }

            if (score > max) max = score;
        }

        System.out.print(max);
    }
}