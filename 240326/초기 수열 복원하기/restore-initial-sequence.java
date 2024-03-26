import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] sums = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            sums[i] = sc.nextInt();
        }

        int[] ans = new int[N];
        
        for (int start = 1; start <= N; start++) {
            int[] temp = new int[N];
            boolean[] isUsed = new boolean[N + 1];
            temp[0] = start;
            isUsed[start] = true;

            boolean flag = true;

            for (int i = 0; i < N - 1; i++) {
                int sum = sums[i];

                int other = sum - temp[i];

                if (other <= 0 || other > N || isUsed[other]) {
                    flag = false;
                    break;
                }

                temp[i + 1] = other;
                isUsed[other] = true;
            }

            if (flag) {
                ans = temp;
                break;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", ans[i]);
        }
    }
}