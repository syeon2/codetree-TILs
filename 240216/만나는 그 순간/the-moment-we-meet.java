import java.util.Scanner;

public class Main {

    public static int[] nList = new int[1000001];
    public static int[] mList = new int[1000001];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int nSecond = 1;
        for (int n = 0; n < N; n++) {
            char direc = sc.next().charAt(0);
            int move = sc.nextInt();

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

        int mSecond = 1;
        for (int m = 0; m < M; m++) {
            char direc = sc.next().charAt(0);
            int move = sc.nextInt();

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

        int ans = -1;
        for (int i = 1; i < mSecond; i++) {
            if (nList[i] == mList[i]) {
                ans = i;
                break;
            }
        }

        System.out.print(ans);
    }
}