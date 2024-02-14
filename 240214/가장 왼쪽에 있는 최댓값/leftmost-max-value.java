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

        int idx = N;

        while (idx != 0) {
            int max = 0;
            int temp = 0;

            for (int i = 0; i < idx; i++) {
                if (list[i] > max) {
                    max = list[i];
                    temp = i;
                }
            }

            System.out.printf("%d ", temp + 1);

            idx = temp;
        }
    }
}