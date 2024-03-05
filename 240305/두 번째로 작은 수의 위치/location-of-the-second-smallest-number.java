import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = sc.nextInt();
        }

        int minNum = 101;
        for (int i = 1; i <= N; i++) {
            minNum = Math.min(minNum, list[i]);
        }

        int nextMinNum = 101;
        int idx = -1;
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (list[i] == minNum) continue;
            else {
                if (nextMinNum > list[i]) {
                    nextMinNum = list[i];
                    cnt = 1;
                    idx = i;
                } else if (nextMinNum == list[i]) {
                    cnt++;
                }
            }
        }

        if (cnt >= 2) System.out.print(-1);
        else System.out.print(idx);
    }
}