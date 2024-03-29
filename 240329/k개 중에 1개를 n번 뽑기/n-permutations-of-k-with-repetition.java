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

        recur(list, 0, "", K);
    }

    public static void recur(int[] list, int cnt, String str, int K) {
        if (cnt == K) {
            System.out.println(str);
            return;
        }

        for (int i = 0; i < list.length; i++) {
            String renewStr = (str + " " + list[i]).trim();
            
            recur(list, cnt + 1, renewStr, K);
        }
    }
}