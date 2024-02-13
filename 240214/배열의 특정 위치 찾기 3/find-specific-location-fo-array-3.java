import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int idx = 0;
        int[] list = new int[100];

        for (int i = 0; i < 100; i++) {
            int num = sc.nextInt();

            if (num == 0) break;

            list[i] = num;
            idx = i;
        }

        int sum = 0;

        for (int i = idx; i >= idx - 2; i--) {
            sum += list[i];
        }

        System.out.println(sum);
    }
}