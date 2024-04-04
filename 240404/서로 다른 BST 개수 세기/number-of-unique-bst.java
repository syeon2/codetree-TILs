import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N + 1];
        list[1] = 1;
        if (N >= 2) list[2] = 2;

        for (int i = 3; i <= N; i++) {
            list[i] = list[i - 1];

            for (int k = 0; k <= N - 1; k++) {
                list[i] += (list[N - k - 1] * list[N - (N - k)]);
            }
        }

        System.out.print(list[N]);
    }
}