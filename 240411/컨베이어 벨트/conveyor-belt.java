import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();

        int[] aList = new int[N];
        int[] bList = new int[N];

        for (int i = 0; i < N; i++) {
            aList[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            bList[i] = sc.nextInt();
        }

        while (T-- > 0) {
            int tempA = aList[N - 1];
            int tempB = bList[N - 1];

            for (int i = N - 1; i >= 1; i--) {
                aList[i] = aList[i - 1];
                bList[i] = bList[i - 1];
            }

            aList[0] = tempB;
            bList[0] = tempA;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(aList[i]).append(" ");
        }
        sb.append("\n");
        for (int i = 0; i < N; i++) {
            sb.append(bList[i]).append(" ");
        }

        System.out.print(sb);
    }
}