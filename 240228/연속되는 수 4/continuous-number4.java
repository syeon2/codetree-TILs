import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];
        list[0] = sc.nextInt();

        int ans = 1;
        int tempCnt = 1;

        for (int i = 1; i < N; i++) {
            list[i] = sc.nextInt();

            if (list[i - 1] < list[i]) tempCnt++;
            else tempCnt = 1;

            if (ans < tempCnt) ans = tempCnt;
        }

        System.out.print(ans);
    }
}