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

        for (int n = 0; n < N; n++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int i = 1; i <= t; i++) {
                listA[++curTimeA] = listA[curTimeA - 1] + v;
            }
        }

        for (int m = 0; m < M; m++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int i = 1; i <= t; i++) {
                listB[++curTimeB] = listB[curTimeB - 1] + v;
            }
        }

        int flag = -1;
        int cnt = 0;

        for (int i = 1; i <= curTimeA; i++) {
            if (listA[i] > listB[i] && (flag == 1 || flag == -1)) {
                flag = 0;
                cnt++;
            } else if (listA[i] < listB[i] && (flag == 0 || flag == -1)) {
                flag = 1;
                cnt++;
            }
        }

        if (flag == -1) System.out.print(cnt);
        else System.out.print(cnt - 1);
    }
}