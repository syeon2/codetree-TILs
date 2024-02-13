import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];

        int idx = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            list[i] = num;
            if (num % 2 == 0) idx++;
        }

        int[] ans = new int[idx];
        int realIdx = 0;

        for (int i = 0; i < N; i++) {
            if (list[i] % 2 == 0) ans[realIdx++] = list[i];
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.printf("%d ", ans[i]);
        }
    }
}