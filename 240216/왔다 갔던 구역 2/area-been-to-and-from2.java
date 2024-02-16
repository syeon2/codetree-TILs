import java.util.Scanner;

public class Main {

    public static int OFFSET = 1000;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] section = new int[2001];

        int curPos = OFFSET;

        for (int n = 0; n < N; n++) {
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'L') {
                for (int i = curPos - 1; i >= curPos - move; i--) {
                    section[i]++;
                }

                curPos -= move;
            } else {
                for (int i = curPos + 1; i <= curPos + move; i++) {
                    section[i]++;
                }

                curPos += move;
            }
        }

        int cnt = 0;
        for (int i = 0; i < section.length; i++) {
            if (section[i] >= 2) cnt++;
        }

        System.out.print(cnt);
    }
}