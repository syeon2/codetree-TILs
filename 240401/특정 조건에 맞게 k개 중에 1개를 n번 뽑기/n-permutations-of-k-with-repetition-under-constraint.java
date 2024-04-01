import java.util.*;

public class Main {

    public static int N;
    public static int K;

    public static int[] list;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        K = sc.nextInt();
        N = sc.nextInt();

        list = new int[N];

        permutation(0);

        System.out.print(sb);
    }

    public static void permutation(int idx) {
        if (idx == N) {
            for (int i = 0; i < idx; i++) {
                sb.append(list[i]).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = 1; i <= K; i++) {
            if (idx >= 2) {
                if (list[idx - 2] == list[idx - 1] && list[idx - 1] == i) continue;
                else {
                    list[idx] = i;
                    permutation(idx + 1);
                }
            } else {
                list[idx] = i;
                permutation(idx + 1);
            }
        }
    }
}