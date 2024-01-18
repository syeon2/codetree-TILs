import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] listA = new int[50001];
        int[] listB = new int[50001];

        int curTimeA = 0;
        int curTimeB = 0;

        int curPosA = 0;
        int curPosB = 0;

        for (int n = 0; n < N; n++) {
            int move = sc.nextInt();
            String direction = sc.next();

            for (int i = 0; i < move; i++) {
                if (direction.equals("R")) {
                    listA[++curTimeA] = ++curPosA;
                } else {
                    listA[++curTimeA] = --curPosA;
                }
            }
        }

        while (listA.length > ++curTimeA) {
            listA[curTimeA] = listA[curTimeA - 1];
        }

        for (int m = 0; m < M; m++) {
            int move = sc.nextInt();
            String direction = sc.next();

            for (int i = 0; i < move; i++) {
                if (direction.equals("R")) {
                    listB[++curTimeB] = ++curPosB;
                } else {
                    listB[++curTimeB] = --curPosB;
                }
            }
        }

        while (listB.length > ++curTimeB) {
            listB[curTimeB] = listB[curTimeB - 1];
        }

        int cnt = 0;

        for (int i = 1; i <= 50000; i++) {
            if (listA[i - 1] != listB[i - 1] && listA[i] == listB[i]) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}