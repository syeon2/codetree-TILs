import java.util.Scanner;

public class Main {

    public static int[] start;
    public static int[] end;

    public static int OFFSET = 1000;
    public static int[] checked = new int[2001];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        start = new int[N];
        end = new int[N];

        int curPos = 0;

        for (int n = 0; n < N; n++) {
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'L') {
                start[n] = curPos - move;
                end[n] = curPos;

                curPos -= move;
            } else {
                start[n] = curPos;
                end[n] = curPos + move;

                curPos += move;
            }
        }

        for (int i = 0; i < N; i++) {
            int s = start[i];
            int e = end[i];

            for (int k = s; k < e; k++) {
                checked[k + OFFSET]++;
            }
        }

        int cnt = 0;
        for (int i = 0; i < checked.length; i++) {
            if (checked[i] >= 2) cnt++;
        }

        System.out.println(cnt);
    }
}