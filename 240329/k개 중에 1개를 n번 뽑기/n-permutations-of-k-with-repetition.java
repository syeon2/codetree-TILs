import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = i + 1;
        }

        for (int i = 0; i < N; i++) {
            recur(list, 1, String.valueOf(list[i]), K);
        }
    }

    public static void recur(int[] list, int cnt, String str, int K) {
        if (cnt == K) {
            System.out.println(str);
            return;
        }

        for (int i = 0; i < list.length; i++) {
            recur(list, cnt + 1, str + " " + list[i], K);
        }
    }
}