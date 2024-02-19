import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] line = new int[101];
        for (int n = 0; n < N; n++) {
            int candy = sc.nextInt();
            int pos = sc.nextInt();

            line[pos] += candy;
        }

        int ans = 0;
        for (int i = K; i <= 100 - K; i++) {

            int temp = 0;
            for (int k = i - K; k <= i + K; k++) {
                temp += line[k];
            }

            ans = Math.max(ans, temp);
        }

        System.out.print(ans);
    }
}