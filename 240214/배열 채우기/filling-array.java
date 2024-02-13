import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int idx = 0;
        int[] list = new int[10];

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num == 0) break;

            idx = i;
            list[i] = num;
        }

        for (int i = idx; i >= 0; i--) {
            System.out.print(String.format("%d ", list[i]));
        }
    }
}