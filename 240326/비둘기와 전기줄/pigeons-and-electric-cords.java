import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];
        Arrays.fill(list, 2);

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int bird = sc.nextInt();
            int pos = sc.nextInt();

            if (list[bird] == 2) list[bird] = pos;
            else if (list[bird] != pos) {
                ans++;
                list[bird] = pos;
            }
        }

        System.out.print(ans);
    }
}