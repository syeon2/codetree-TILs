import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] nList = new int[1000001];
        int[] mList = new int[1000001];

        int N = sc.nextInt();
        int M = sc.nextInt();

        int nSecond = 1;
        for (int n = 0; n < N; n++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                nList[nSecond] = nList[nSecond - 1] + v;

                nSecond++;
            }
        }

        int mSecond = 1;
        for (int m = 0; m < M; m++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                mList[mSecond] = mList[mSecond - 1] + v;

                mSecond++;
            }
        }

        int isWin = 0;
        int cnt = 0;

        for (int i = 1; i < mSecond; i++) {
            if (isWin != 1 && nList[i] > mList[i]) {
                isWin = 1;
                cnt++;
            } else if (isWin != 2 && nList[i] < mList[i]) {
                isWin = 2;
                cnt++;
            } else if (isWin != 0 && nList[i] == mList[i]) {
                isWin = 0;
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}