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

        int max = 0;
        int idx = 0;
        int[] ans = new int[1000];

        for (int i = 0; i < N; i++) {
            if (list[i] > max) {
                max = list[i];
                ans[idx] = i;
                idx++;
            }
        }

        for (int i = idx - 1; i >= 0; i--) {
            System.out.printf("%d ", ans[i] + 1);
        }
    }
}