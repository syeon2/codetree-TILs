import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        print(N);
    }

    public static int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void print(int n) {
        int cnt = 0;

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n; k++) {
                System.out.printf("%d ", (cnt % 9) + 1);

                cnt++;
            }

            System.out.println();
        }
    }
}