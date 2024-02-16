import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();

        // 최초 감염자 초기화
        boolean[] developers = new boolean[N + 1];
        developers[P] = true;

        // 모두 감염시킬 수 있는 횟수 초기화
        int[] canInfects = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            canInfects[i] = K;
        }

        // idx = 초, [x, y] = 악수한 개발자
        int[][] shakeHands = new int[251][2];
        
        for (int n = 0; n < T; n++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            shakeHands[t][0] = x;
            shakeHands[t][1] = y;
        }

        for (int i = 0; i < shakeHands.length; i++) {
            if (shakeHands[i][0] == 0 && shakeHands[i][0] == 0) continue;

            int x = shakeHands[i][0];
            int y = shakeHands[i][1];

            if ((developers[x] && canInfects[x] > 0) && !developers[y]) {
                developers[y] = true;
                canInfects[x]--;
            } else if ((developers[y] && canInfects[y] > 0) && !developers[x]) {
                developers[x] = true;
                canInfects[y]--;
            } else if (developers[x] && developers[y]) {
                canInfects[x]--;
                canInfects[y]--;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (developers[i]) System.out.print(1);
            else System.out.print(0);
        }
    }
}