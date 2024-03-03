import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        char[] list = new char[1001];

        for (int t = 0; t < T; t++) {
            char c = sc.next().charAt(0);
            int pos = sc.nextInt();

            list[pos] = c;
        }

        int ans = 0;

        for (int i = 1; i < list.length; i++) {

            int sDist = Integer.MAX_VALUE;

            for (int k = 1; k < list.length; k++) {
                if (list[k] == 'S') sDist = Math.min(sDist, Math.abs(k - i));
            }

            int nDist = Integer.MAX_VALUE;

            for (int k = 1; k < list.length; k++) {
                if (list[k] == 'N') nDist = Math.min(nDist, Math.abs(k - i));
            }

            if (sDist <= nDist) ans++;
        }

        System.out.print(ans);
    }
}