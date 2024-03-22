import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] aList = new int[N];
        for (int i = 0; i < N; i++) {
            aList[i] = sc.nextInt();
        }

        int[] bList = new int[M];
        for (int i = 0; i < M; i++) {
            bList[i] = sc.nextInt();
        }

        Arrays.sort(bList);

        int ans = 0;
        for (int i = 0; i <= N - M; i++) {
            int[] temp = new int[M];

            for (int k = i; k < i + M; k++) {
                temp[k - i] = aList[k];
            }

            Arrays.sort(temp);

            boolean flag = true;
            for (int k = 0; k < M; k++) {
                if (temp[k] != bList[k]) flag = false;
            }

            if (flag) ans++;
        }

        System.out.print(ans);
    }
}