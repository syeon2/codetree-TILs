import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] listA = new int[1000001];
        int[] listB = new int[1000001];

        int curSecondA = 0;
        int curPosA = 0;

        int curSecondB = 0;
        int curPosB = 0;

        for (int n = 0; n < N; n++) {
            String direction = sc.next();
            int second = sc.nextInt();

            for (int i = 0; i < second; i++) {
                if (direction.equals("R")) {
                    listA[curSecondA++] = ++curPosA;
                } else {
                    listA[curSecondA++] = --curPosA;
                }
            }
        }

        for (int m = 0; m < M; m++) {
            String direction = sc.next();
            int second = sc.nextInt();

            for (int i = 0; i < second; i++) {
                if (direction.equals("R")) {
                    listB[curSecondB++] = ++curPosB;
                } else {
                    listB[curSecondB++] = --curPosB;
                }
            }
        }

        for (int i = 0; i < 1000001; i++) {
            if (listA[i] == listB[i]) {
                System.out.print(i + 1);
                break;
            }
        }
    }
}