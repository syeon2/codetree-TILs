import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] list = new long[N + 1];
        list[2] = 1;
        if (N >= 3) list[3] = 1;

        for (int i = 4; i <= N; i++) {
            list[i] = list[i - 2] + list[i - 3];
        }

        System.out.print(list[N] % 10007);
    }
}