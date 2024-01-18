import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] listA = new int[1000001];
        int[] listB = new int[1000001];

        int curTimeA = 0;
        int curTimeB = 0;

        int curPosA = 0;
        int curPosB = 0;

        for (int n = 0; n < N; n++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                listA[++curTimeA] = listA[curTimeA - 1] + v;
            }
        }

        for (int m = 0; m < M; m++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                listB[++curTimeB] = listB[curTimeB - 1] + v;
            }
        }

        int honner = 0;
        int ans = 0;

        for (int i = 1; i <= Math.min(curTimeA, curTimeB); i++) {
            if (listA[i] == listB[i] && honner != 3) {
                honner = 3;
                ans++;
            } else if (listA[i] > listB[i] && honner != 1) {
                honner = 1;
                ans++;
            } else if (listA[i] < listB[i] && honner != 2) {
                honner = 2;
                ans++;
            }
        }

        System.out.print(ans);
    }
}