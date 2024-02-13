import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[10];

        int a = sc.nextInt();
        int b = sc.nextInt();

        list[0] = a;
        list[1] = b;

        for (int i = 2; i < 10; i++) {
            list[i] = (list[i - 1] + list[i - 2]) % 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", list[i]);
        }
    }
}