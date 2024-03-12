import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] ans = new int[N];
        int idx = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int cnt = 1;
        while (queue.size() != 0) {
            if (cnt == K) {
                int num = queue.remove();
                ans[idx++] = num;
                cnt = 1;
            } else {
                queue.add(queue.remove());
                cnt++;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}