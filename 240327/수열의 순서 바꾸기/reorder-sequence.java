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
            boolean isAsc = true;
            for (int i = 2; i <= N; i++) {
                if (list[i - 1] > list[i]) isAsc = false;
            }

            if (isAsc) break;

            int idx = 0;
            int value = 0;

            for (int i = N; i >= 1; i--) {
                if (i == list[i]) continue;

                if (value < list[i]) {
                    value = list[i];
                    idx = i;
                }
            }

            if (idx == 1) {
                ans++;
                
                for (int i = 2; i <= value; i++) {
                    list[i - 1] = list[i];
                }

                list[value] = value;
            } else {
                ans++;
                value = list[1];

                for (int i = idx + 1; i <= N; i++) {
                    if (list[i] > value) {

                        for (int k = 2; k < i; k++) {
                            list[k - 1] = list[k];
                        }

                        list[i - 1] = value;
                        break;
                    }
                }
            }
        }

        System.out.print(ans);
    }
}