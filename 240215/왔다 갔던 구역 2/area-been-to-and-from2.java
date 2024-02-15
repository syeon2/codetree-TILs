import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] plusList = new int[1001];
        int[] minusList = new int[1001];

        int curPos = 0;

        for (int n = 0; n < N; n++) {
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'L') {
                for (int i = curPos - 1; i >= curPos - move; i--) {
                    if (i >= 0) plusList[i]++;
                    else minusList[Math.abs(i)]++;
                }

                curPos -= move;
            } else {
                for (int i = curPos + 1; i <= curPos + move; i++) {
                    if (i >= 0) plusList[i]++;
                    else minusList[Math.abs(i)]++;
                }

                curPos += move;
            }
        }

        int cnt = 0;
        for (int i = 0; i < plusList.length; i++) {
            if (plusList[i] >= 2) cnt++;
            if (minusList[i] >= 2) cnt++;
        }

        System.out.print(cnt);
    }
}