import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Queue<Integer> que = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            que.add(i);
        }

        while (que.size() != 0) {
            for (int i = 1; i < K; i++) {
                que.add(que.remove());
            }

            System.out.printf("%d ", que.remove());
        }
    }
}