import java.util.*;

public class Main {

    public static int K;
    public static int N;

    public static int[] list;

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        K = sc.nextInt();
        N = sc.nextInt();
        list = new int[N];

        perm(0);

        System.out.print(sb);
    }

    public static void perm(int depth) {
        if (depth == N) {
            for (int i = 0; i < list.length; i++) {
                sb.append(list[i]).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = 1; i <= K; i++) {
            list[depth] = i;
            perm(depth + 1);
        }
    }
}