import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];

        int min = 101;
        int max = 0;
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();

            min = Math.min(min, list[i]);
            max = Math.max(max, list[i]);
        }

        int ans = 0;
        for (int i = min + 1; i <= max - 1; i++) {

            int sub = i;
            int cnt = 0;

            for (int k = 0; k < N; k++) {

                for (int j = k + 1; j < N; j++) {
                    double num = (double) (list[k] + list[j]) / 2;

                    if (sub == num) cnt++;
                }
            }

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}