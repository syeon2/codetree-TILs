import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();

        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 10000;

        for (int i = 0; i < N; i++) {

            for (int k = i + 1; k < N; k++) {

                int temp = 0;

                for (int j = 0; j < N; j++) {
                    if (j == i || j == k) continue;

                    temp += list[j];
                }

                if (ans > Math.abs(S - temp)) ans = Math.abs(S - temp);
            }
        }

        System.out.print(ans);
    }
}