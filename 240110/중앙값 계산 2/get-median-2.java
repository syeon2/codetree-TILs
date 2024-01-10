import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                int[] temp = new int[i + 1];

                for (int k = 1; k <= i; k++) {
                    temp[k] = list[k];
                }

                Arrays.sort(temp);

                System.out.printf("%d ", temp[(i / 2) + 1]);
            }
        }
    }
}