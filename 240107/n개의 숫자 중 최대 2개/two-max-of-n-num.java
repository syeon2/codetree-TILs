import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int max = 0;
        int second = 0;

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();

            if (i == 0) {
                max = n;
                second = n;
            } else {
                if (max < n) max = n;
                else {
                    if (second < n) second = n;
                }
            }
        }

        System.out.printf("%d %d", max, second);
    }
}