import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int min = 0;
        int cnt = 1;

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();

            if (i == 0) min = n;
            else {
                if (min > n) {
                    cnt = 1;
                    min = n;
                } else if (min == n) cnt++;
            }
        }

        System.out.printf("%d %d", min, cnt);
    }
}