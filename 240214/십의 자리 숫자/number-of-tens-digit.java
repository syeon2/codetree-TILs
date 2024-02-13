import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[10];

        int num;

        while ((num = sc.nextInt()) != 0) {
            int idx = num / 10;

            list[idx]++;
        }

        for (int i = 1; i < 10; i++) {
            System.out.print(String.format("%d - %d\n", i, list[i]));
        }
    }
}