import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[4];
        int[][] records = new int[N][3];
        for (int i = 0; i < N; i++) {
            records[i][0] = sc.nextInt();
            records[i][1] = sc.nextInt();
            records[i][2] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i <= 3; i++) {
            list[i] = 1;

            int sum = 0;

            for (int k = 0; k < N; k++) {
                int a = records[k][0];
                int b = records[k][1];
                int c = records[k][2];

                int temp = list[a];
                list[a] = list[b];
                list[b] = temp;

                sum += list[c];
            }

            if (ans < sum) ans = sum;

            list[1] = list[2] = list[3] = 0;
        }

        System.out.print(ans);
    }
}