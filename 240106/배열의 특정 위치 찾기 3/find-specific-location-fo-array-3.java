import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[10];

        int idx = 0;

        for (int i = 0; i < 10; i++) {

            int n = sc.nextInt();

            if (n == 0) {
                idx = i;
                break;
            } else list[i] = n;
        }

        int sum = 0;
        for (int i = idx - 1; i >= idx - 3; i--) {
            sum += list[i];
        }

        System.out.print(sum);
    }
}