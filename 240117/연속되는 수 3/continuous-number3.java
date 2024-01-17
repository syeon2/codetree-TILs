import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int cnt = 1;
        int ans = cnt;

        for (int i = 1; i < N; i++) {
            if (list[i - 1] > 0 && list[i] > 0) cnt++;
            else if (list[i - 1] < 0 && list[i] < 0) cnt++;
            else {
                ans = Math.max(ans, cnt);
                cnt = 1;
            } 
        }

        System.out.print(ans);
    }
}