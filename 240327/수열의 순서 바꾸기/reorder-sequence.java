import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int cnt = 1;

        for (int i = N - 1; i >= 1; i--) {
            if (list[i - 1] < list[i]) cnt++;
            else break;
        }

        System.out.print(N - cnt);
    }
}