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

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (list[i] < first) {
                second = first;
                first = list[i];
            }
            
            if (first < list[i] && second > list[i]) {
                second = list[i];
            }
        }

        if (second == Integer.MAX_VALUE) System.out.print(-1);
        else {
            int cnt = 0;
            int idx = 0;

            for (int i = 0; i < N; i++) {
                if (list[i] == second) {
                    cnt++;
                    idx = i;
                }
            }

            if (cnt > 1) System.out.print(-1);
            else System.out.print(idx + 1);
        }
    }
}