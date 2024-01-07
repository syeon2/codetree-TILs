import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int min = Integer.MAX_VALUE;

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            if (min > list[i + 1] - list[i]) min = list[i + 1] - list[i];
        }

        System.out.print(min);
    }
}