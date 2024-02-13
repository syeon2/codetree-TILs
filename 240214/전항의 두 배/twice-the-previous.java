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

        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 1) System.out.printf("%d ", list[i]);
            else {
                list[i] = list[i - 1] + (2 * list[i - 2]);

                System.out.printf("%d ", list[i]);
            }
        }
    }
}