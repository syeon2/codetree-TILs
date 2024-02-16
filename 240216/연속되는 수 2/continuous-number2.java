import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 1;
        int cur = sc.nextInt();

        int max = 1;

        for (int n = 0; n < N - 1; n++) {
            int num = sc.nextInt();

            if (cur == num) cnt++;
            else {
                if (max < cnt) max = cnt;
                cnt = 1;
            }

            cur = num;
        }

        System.out.print(Math.max(cnt, max));
    }
}