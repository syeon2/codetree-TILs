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
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'L') {
                while (move-- > 0) {
                    nList[nSecond] = nList[nSecond - 1] - 1;

                    nSecond++;
                }
            } else {
                while (move-- > 0) {
                    nList[nSecond] = nList[nSecond - 1] + 1;

                    nSecond++;
                }
            }
        }

        for (int i = nSecond; i < nList.length; i++) {
            nList[i] = nList[i - 1];
        }

        int mSecond = 1;
        for (int m = 0; m < M; m++) {
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'L') {
                while (move-- > 0) {
                    mList[mSecond] = mList[mSecond - 1] - 1;

                    mSecond++;
                }
            } else {
                while (move-- > 0) {
                    mList[mSecond] = mList[mSecond - 1] + 1;

                    mSecond++;
                }
            }
        }

        for (int i = mSecond; i < mList.length; i++) {
            mList[i] = mList[i - 1];
        }

        int cnt = 0;
        for (int i = 1; i < nList.length; i++) {
            if ((nList[i - 1] != mList[i - 1]) && (nList[i] == mList[i])) cnt++;
        }

        System.out.print(cnt);
    }
}