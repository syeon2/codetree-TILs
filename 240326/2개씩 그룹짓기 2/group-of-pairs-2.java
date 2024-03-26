import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N * 2];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int sub = list[i + N] - list[i];

            ans = Math.min(ans, sub);
        }

        System.out.print(ans);
    }
}