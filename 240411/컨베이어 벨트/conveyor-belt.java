import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();

        int[] aList = new int[3];
        int[] bList = new int[3];

        for (int i = 0; i < 3; i++) {
            aList[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            bList[i] = sc.nextInt();
        }

        while (T-- > 0) {
            int tempA = aList[2];
            int tempB = bList[2];

            for (int i = 2; i >= 1; i--) {
                aList[i] = aList[i - 1];
                bList[i] = bList[i - 1];
            }

            aList[0] = tempB;
            bList[0] = tempA;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(aList[i]).append(" ");
        }
        sb.append("\n");
        for (int i = 0; i < 3; i++) {
            sb.append(bList[i]).append(" ");
        }

        System.out.print(sb);
    }
}