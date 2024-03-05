import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] alp = new char[N];

        for (int i = 0; i < N; i++) {
            alp[i] = sc.next().charAt(0);
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            char target = alp[i];
            char comp = (char) (i + 'A');

            if (comp == target) continue;

            int idx = 0;
            for (int k = i; k < N; k++) {
                if (alp[k] == comp) idx = k;
            }

            for (int k = idx; k > i; k--) {
                char temp = alp[k];
                alp[k] = alp[k - 1];
                alp[k - 1] = temp;
                ans++;
            }
        }

        System.out.print(ans);
    }
}