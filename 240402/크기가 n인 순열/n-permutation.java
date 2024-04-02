import java.util.*;

public class Main {

    public static int N;
    public static int[] ansList;
    public static boolean[] isVisit;

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        ansList = new int[N];
        isVisit = new boolean[N + 1];

        recur(0);

        System.out.print(sb);
    }

    public static void recur(int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                sb.append(ansList[i]).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (isVisit[i]) continue;
            isVisit[i] = true;
            ansList[depth] = i;
            recur(depth + 1);
            isVisit[i] = false;
        }
    }
}