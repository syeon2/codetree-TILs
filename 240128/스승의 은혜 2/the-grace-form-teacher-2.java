import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int ans = 0;

        for (int i = 0; i < N; i++) {

            int temp = list[i] / 2;
            int cnt = 1;

            for (int k = 0; k < N; k++) {
                if (i == k) continue;
                
                if (temp + list[k] <= B) {
                    temp += list[k];
                    cnt++;
                } else break;
            }

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}