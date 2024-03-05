import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 0;
        while (true) {
            Arrays.sort(list);

            if (list[0] == list[list.length - 1]) break;
            else {
                list[0]++;
                list[list.length - 1]--;
                ans++;
            }
        }

        System.out.print(ans);
    }
}