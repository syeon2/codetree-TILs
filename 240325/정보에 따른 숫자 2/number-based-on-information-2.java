import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        char[] line = new char[1001];

        for (int t = 0; t < T; t++) {
            char c = sc.next().charAt(0);
            int pos = sc.nextInt();

            line[pos] = c;
        }

        int ans = 0;

        for (int i = a; i <= b; i++) {
            int d1 = 1001;
            int d2 = 1001;

            for (int k = i; k <= 1000; k++) {
                if (line[k] == 'S') d1 = Math.min(d1, k - i);
                if (line[k] == 'N') d2 = Math.min(d2, k - i);
            }

            for (int k = i; k >= 0; k--) {
                if (line[k] == 'S') d1 = Math.min(d1, i - k);
                if (line[k] == 'N') d2 = Math.min(d2, i - k);
            }

            if (d1 <= d2) ans++;
        }

        System.out.print(ans);
    }
}