import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] list = new int[N][2];

        for (int i = 0; i < N; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        boolean flag = true;

        int comX1 = -1;
        int comX2 = -1;

        for (int i = 0; i < N; i++) {
            if (comX1 == -1) {
                comX1 = list[i][0];
                comX2 = list[i][1];
            } else {
                if ((comX1 < list[i][0] && comX2 < list[i][0]) || (list[i][0] < comX1 && list[i][1] < comX1)) {
                    flag = false;
                    break;
                } else {
                    comX1 = Math.max(comX1, list[i][0]);
                    comX2 = Math.min(comX2, list[i][1]);
                }
            }
        }

        if (flag) System.out.print("Yes");
        else System.out.print("No");
    }
}