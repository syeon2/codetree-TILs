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

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int remain = sc.nextInt();

            if (list[i] > remain) {
                int move = list[i] - remain;

                ans += move;
                list[i + 1] += move;
            }
        }

        System.out.print(ans);
    }
}