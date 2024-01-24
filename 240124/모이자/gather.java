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

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {

            int temp = 0;
            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                temp += Math.abs(i - k) * list[k];
            }

            if (temp < min) min = temp;
        }

        System.out.print(min);
    }
}