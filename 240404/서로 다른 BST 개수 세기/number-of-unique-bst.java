import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N + 1];
        list[0] = 1;
        list[1] = 1;
        if (N >= 2) list[2] = 2;

        for (int i = 3; i <= N; i++) {
            for (int k = 0; k <= i - 1; k++) {
                list[i] += list[k] * list[i - k - 1];
            }
        }

        System.out.print(list[N]);
    }
}