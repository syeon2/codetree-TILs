import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        char[] list = sc.next().toCharArray();

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (list[i] == '1') continue;

            list[i] = '1';

            for (int k = i + 1; k < N; k++) {
                if (list[k] == '1') continue;

                list[k] = '1';

                int prev = -1;
                int temp = 101;

                for (int j = 0; j < N; j++) {
                    if (list[j] == '1') {
                        if (prev == -1) prev = j;
                        else {
                            temp = Math.min(temp, j - prev);
                            prev = j;
                        }
                    }
                }

                ans = Math.max(ans, temp);

                list[k] = '0';
            }

            list[i] = '0';
        }

        System.out.print(ans);
    }
}