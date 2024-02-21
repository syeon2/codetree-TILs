import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] list = new int[N][2];
        for (int i = 0; i < N; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        boolean flag = false;

        for (int i = 0; i < N; i++) {

            int start = 0;
            int end = Integer.MAX_VALUE;

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                start = Math.max(start, list[k][0]);
                end = Math.min(end, list[k][1]);
            }

            if (start <= end) {
                flag = true;
                break;
            }
        }

        if (flag) System.out.print("Yes");
        else System.out.print("No");
    }
}