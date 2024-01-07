import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[10];

        while (true) {
            int n = sc.nextInt();

            if (n == 0) break;

            int temp = n / 10;

            if (temp == 0) continue;
            else list[temp - 1]++;
        }

        for (int i = 9; i >= 0; i--) {
            System.out.printf("%d - %d\n", (i + 1) * 10, list[i]);
        }
    }
}