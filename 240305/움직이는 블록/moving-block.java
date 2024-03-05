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

        int temp = 0;
        for (int i = 0; i < N; i++) {
            temp += list[i];
        }

        temp /= N;

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (temp > list[i]) ans += (temp - list[i]);
        }

        System.out.print(ans);
    }
}