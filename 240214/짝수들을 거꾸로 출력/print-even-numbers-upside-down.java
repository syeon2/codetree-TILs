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

        for (int i = N - 1; i >= 0; i--) {
            if (list[i] % 2 == 0) System.out.printf("%d ", list[i]);
        }
    }
}