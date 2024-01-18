import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] listA = new int[1000001];
        int[] listB = new int[1000001];

        int curTimeA = 0;
        int curPosA = 0;

        int curTimeB = 0;
        int curPosB = 0;

        for (int i = 0; i < N; i++) {
            String direction = sc.next();
            int move = sc.nextInt();

            if (direction.equals("R")) {
                for (int k = 1; k <= move; k++) {
                    listA[++curTimeA] = ++curPosA;
                }
            } else {
                for (int k = 1; k <= move; k++) {
                    listA[++curTimeA] = --curPosA;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            String direction = sc.next();
            int move = sc.nextInt();

            if (direction.equals("R")) {
                for (int k = 1; k <= move; k++) {
                    listB[++curTimeB] = ++curPosB;
                }
            } else {
                for (int k = 1; k <= move; k++) {
                    listB[++curTimeB] = --curPosB;
                }
            }
        }

        boolean flag = false;
        for (int i = 1; i < Math.min(curTimeA, curTimeB); i++) {
            if (listA[i] == listB[i]) {
                System.out.print(i);
                flag = true;
                break;
            }
        }

        if (!flag) System.out.print(-1);
    }
}