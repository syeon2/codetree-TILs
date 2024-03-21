import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] aTime = new int[1000001];
        int[] bTime = new int[1000001];

        Arrays.fill(aTime, Integer.MAX_VALUE);

        int curATime = 0;
        
        for (int n = 0; n < N; n++) {
            char direc = sc.next().charAt(0);
            int move = sc.nextInt();

            if (direc == 'R') {
                while (move > 0) {
                    move--;
                    if (curATime == 0) aTime[curATime] = 1;
                    else aTime[curATime] = aTime[curATime - 1] + 1;

                    curATime++;
                }
            } else {
                while (move > 0) {
                    move--;
                    if (curATime == 0) aTime[curATime] = -1;
                    else aTime[curATime] = aTime[curATime - 1] - 1;

                    curATime++;
                }
            }
        }

        int curBTime = 0;

        for (int m = 0; m < M; m++) {
            char direc = sc.next().charAt(0);
            int move = sc.nextInt();

            if (direc == 'R') {
                while (move > 0) {
                    move--;
                    if (curBTime == 0) bTime[curBTime] = 1;
                    else bTime[curBTime] = bTime[curBTime - 1] + 1;

                    curBTime++;
                }
            } else {
                while (move > 0) {
                    move--;
                    if (curBTime == 0) bTime[curBTime] = -1;
                    else bTime[curBTime] = bTime[curBTime - 1] - 1;

                    curBTime++;
                }
            }
        }

        int ans = -1;

        for (int i = 0; i < aTime.length; i++) {
            if (aTime[i] == Integer.MAX_VALUE) break;

            if (aTime[i] == bTime[i]) {
                ans = i + 1;
                break;
            }
        }

        System.out.print(ans);
    }
}