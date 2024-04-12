import java.util.*;

public class Main {

    public static int N;
    public static int M;

    public static int[] list;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        boolean bomed = true;

        while (bomed) {
            if (N == 0) break;
            
            bomed = false;

            int prev = 0;
            int v = list[0];

            int cnt = 0;

            for (int i = 1; i < N; i++) {
                if (v == list[i]) continue;
                else {
                    if (i - prev >= M) {
                        for (int k = prev; k < i; k++) {
                            list[k] = 0;
                            cnt++;
                        }

                        prev = i;
                        v = list[i];
                        bomed = true;
                    }
                }
            }

            if (N - prev >= M) {
                for (int i = prev; i < N; i++) {
                    list[i] = 0;
                    cnt++;
                }
                bomed = true;
            }

            N -= cnt;
            int[] memo = new int[N];

            int idx = 0;
            for (int i = 0; i < list.length; i++) {
                if (list[i] == 0) continue;
                else memo[idx++] = list[i];
            }

            list = memo;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(N).append("\n");
        for (int i = 0; i < N; i++) {
            sb.append(list[i]).append("\n");
        }

        System.out.print(sb);
    }
}