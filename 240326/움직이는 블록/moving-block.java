import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int total = 0;
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
            total += list[i];
        }

        int avg = total / N;

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += Math.abs(avg - list[i]);
        }

        System.out.print(ans / 2);
    }
}