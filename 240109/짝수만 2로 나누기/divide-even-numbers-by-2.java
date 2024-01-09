import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        divide(list);

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", list[i]);
        }
    }

    public static void divide(int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) list[i] /= 2;
        }
    }
}