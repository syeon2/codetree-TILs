import java.util.*;

public class Main {

    public static int N;
    public static int M;

    public static List<Integer> list = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        recur(1, 0);

        System.out.print(sb);
    }

    public static void recur(int idx, int cnt) {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(list.get(i)).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = idx; i <= N; i++) {
            list.add(i);
            recur(i + 1, cnt + 1);
            list.remove(list.size() - 1);
        }
    }
}