import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[2002];

        int curPos = 1000;

        for (int n = 0; n < N; n++) {
            int move = sc.nextInt();
            int direc = sc.next().charAt(0);

            if (direc == 'L') {
                for (int i = curPos - 1; i >= curPos - move; i--) {
                    list[i]++;
                }

                curPos -= move;
            } else {
                for (int i = curPos + 1; i <= curPos + move; i++) {
                    list[i]++;
                }

                curPos += move;
            }
        }

        int cnt = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] >= 2) cnt++;
        }

        System.out.print(cnt);
    }
}