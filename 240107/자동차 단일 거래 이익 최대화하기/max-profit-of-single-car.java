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

        int max = 0;

        for (int i = 0; i < N - 1; i++) {

            for (int k = i + 1; k < N; k++) {
                if (list[k] - list[i] > max) max = list[k] - list[i];
            }
        }

        System.out.print(max);
    }
}