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

        int ans = Integer.MAX_VALUE;
        // 2배
        for (int i = 0; i < N; i++) {
            list[i] *= 2;

            // 제외
            for (int k = 0; k < N; k++) {

                int[] reList = new int[N - 1];
                int cnt = 0;

                for (int j = 0; j < N; j++) {
                    if (j == k) continue;

                    reList[cnt++] = list[j];
                }

                int subDiff = 0;

                for (int j = 0; j < reList.length - 1; j++) {
                    subDiff += Math.abs(reList[j] - reList[j + 1]);
                }

                ans = Math.min(subDiff, ans);
            }

            list[i] /= 2;
        }

        System.out.print(ans);
    }
}