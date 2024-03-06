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

        int ans = 0;
        while (true) {
            int[] copy = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                copy[i] = list[i];
            }

            boolean flag = true;

            for (int i = 1; i <= N; i++) {
                if (copy[i - 1] > copy[i]) flag = false;
            }

            if (flag) break;

            int curNum = copy[1];

            int changeIdx = N + 1;
            
            for (int i = 1; i <= N; i++) {
                if (copy[i] > curNum) {
                    changeIdx = i;
                }
            }

            for (int i = 2; i < changeIdx; i++) {
                copy[i - 1] = copy[i];
            }

            copy[changeIdx - 1] = curNum;

            for (int i = 1; i <= N; i++) {
                list[i] = copy[i];
            }

            ans++;
        }

        System.out.print(ans);
    }
}