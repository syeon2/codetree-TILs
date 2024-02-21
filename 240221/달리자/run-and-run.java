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

        int[] compare = new int[N];
        for (int i = 0; i < N; i++) {
            compare[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < N - 1; i++) {
            int last = list[i];
            int next = compare[i];

            if (last > next) {
                list[i + 1] += (last - next);

                ans += last - next;
            }
        }

        System.out.print(ans);
    }
}