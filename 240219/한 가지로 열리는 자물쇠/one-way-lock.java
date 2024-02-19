import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[3];

        for (int i = 0; i < 3; i++) {
            list[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {

            if (Math.abs(list[0] - i) <= 2) {
                cnt += N * N;
                continue;
            }
            for (int k = 1; k <= N; k++) {

                if (Math.abs(list[1] - k) <= 2) {
                    cnt += N;
                    continue;
                }

                for (int j = 1; j <= N; j++) {

                    if (Math.abs(list[2] - j) <= 2) {
                        cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}