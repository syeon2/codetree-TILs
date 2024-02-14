import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] list = new int[N + 1];

        for (int n = 1; n <= N; n++) {
            list[n] = sc.nextInt();
        }

        for (int q = 0; q < Q; q++) {
            int qNum = sc.nextInt();

            if (qNum == 1) {
                int idx = sc.nextInt();

                System.out.println(list[idx]);
            } else if (qNum == 2) {
                int cNum = sc.nextInt();
                int idx = 0;

                for (int i = 1; i <= N; i++) {
                    if (cNum == list[i]) {
                        idx = i;
                        break;
                    }
                }

                System.out.println(idx);
            } else {
                int a = sc.nextInt();
                int b = sc.nextInt();

                for (int i = a; i <= b; i++) {
                    System.out.printf("%d ", list[i]);
                }

                System.out.println();
            }
        }
    }
}