import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (min > num) {
                min = num;
                cnt = 1;
            } else if (min == num) cnt++;
        }

        System.out.printf("%d %d", min, cnt);
    }
}