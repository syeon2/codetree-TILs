import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[10];

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (n == 0) break;
            else list[i] = n;
        }

        for (int i = 9; i >= 0; i--) {
            if (list[i] == 0) continue;
            else System.out.printf("%d ", list[i]);
        }
    }
}