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
        for (int n = 1; n <= N; n++) {

            for (int i = 0; i < N - n + 1; i++) {
                
                double avg = 0;
                for (int k = i; k < i + n; k++) {
                    avg += list[k];
                }

                avg /= n;

                for (int k = i; k < i + n; k++) {
                    if (avg == list[k]) {
                        ans++;
                        break;
                    }
                }
            }
        }

        System.out.print(ans);
    }
}