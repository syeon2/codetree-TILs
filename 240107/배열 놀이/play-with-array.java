import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int question = sc.nextInt();

            if (question == 1) {
                int idx = sc.nextInt();

                System.out.println(list[idx - 1]);
            } else if (question == 2) {
                int num = sc.nextInt();

                int cnt = 0;
                int idx = -1;

                for (int k = n - 1; k >= 0; k--) {
                    if (list[k] == num) {
                        cnt++;
                        idx = k;
                    }
                }

                if (idx == -1) System.out.println(0);
                else System.out.println(idx + 1);
            } else {
                int a = sc.nextInt();
                int b = sc.nextInt();

                for (int k = a; k <= b; k++) {
                    System.out.printf("%d ", list[k - 1]);
                }

                System.out.println();
            }
        }
    }
}