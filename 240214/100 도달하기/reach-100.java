import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[100];

        list[1] = 1;
        list[2] = N;

        for (int i = 1; i <= 100; i++) {
            if (i == 1 || i == 2) System.out.printf("%d ", list[i]);
            else {
                list[i] = list[i - 1] + list[i - 2];

                System.out.printf("%d ", list[i]);
            }

            if (list[i] > 100) break;
        }
    }
}