import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[101];

        int cnt = 0;
        for (int i = 1; i <= 100; i++) {
            list[i] = N * i;

            System.out.printf("%d ", list[i]);

            if (list[i] % 5 == 0) cnt++;
            if (cnt == 2) break;
        }
    }
}