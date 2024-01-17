import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 1;
        int ans = 0;

        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 1; i < N; i++) {
            if (list[i - 1] == list[i]) cnt++;
            else {
                ans = Math.max(ans, cnt);
                cnt = 1;
            }
        }

        System.out.print(ans);
    }
}