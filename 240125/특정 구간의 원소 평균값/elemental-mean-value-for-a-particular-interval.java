import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < N; i++) {

            for (int k = i; k < N; k++) {

                int temp = 0;
                int cnt = 0;

                for (int j = i; j <= k; j++) {
                    temp += list[j];
                    cnt++;
                }

                if (temp % cnt != 0) continue;

                int avg = temp / cnt;

                for (int j = i; j <= k; j++) {
                    if (avg == list[j]) {
                        ans++;
                        break;
                    }
                }
            }
        }

        System.out.print(ans);
    }
}