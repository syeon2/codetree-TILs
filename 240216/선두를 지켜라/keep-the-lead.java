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

        // 0이면 비김, 1이면 a가 이기는 중, 2면 b가 이기는 중
        int isWin = 0;
        int cnt = 0;

        for (int i = 0; i < mSecond; i++) {
            if (isWin == 0) {
                if (nList[i] > mList[i]) isWin = 1;
                else if (nList[i] < mList[i]) isWin = 2;
            } else if (isWin != 1 && nList[i] > mList[i]) {
                isWin = 1;
                cnt++;
            } else if (isWin != 2 && nList[i] < mList[i]) {
                isWin = 2;
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}