import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        int S = sc.nextInt();

        boolean[][] peopleCheese = new boolean[N + 1][M + 1]; // p, m
        boolean[] cheeses = new boolean[M + 1];
        int[][] eatRecords = new int[D][3]; // p, m, t
        int[][] illRecords = new int[S][2]; // p, t

        for (int i = 0; i < D; i++) {
            eatRecords[i][0] = sc.nextInt();
            eatRecords[i][1] = sc.nextInt();
            eatRecords[i][2] = sc.nextInt();
        }

        for (int i = 0; i < S; i++) {
            illRecords[i][0] = sc.nextInt();
            illRecords[i][1] = sc.nextInt();
        }

        for (int i = 0; i < S; i++) {
            int illPerson = illRecords[i][0];
            int illSeconds = illRecords[i][1];

            for (int k = 0; k < D; k++) {
                int eatPerson = eatRecords[k][0];
                int eatenCheese = eatRecords[k][1];
                int eatSeconds = eatRecords[k][2];

                if (eatPerson == illPerson && illSeconds > eatSeconds) cheeses[eatenCheese] = true;
            }
        }

        for (int i = 1; i <= M; i++) {
            if (!cheeses[i]) continue;

            for (int k = 0; k < D; k++) {
                int eatPerson = eatRecords[k][0];
                int eatenCheese = eatRecords[k][1];

                if (i == eatenCheese) peopleCheese[eatPerson][eatenCheese] = true;
            }
        }

        int ans = 0;
        for (int i = 1; i <= M; i++) {
            if (!cheeses[i]) continue;
            
            int cnt = 0;
            
            for (int k = 1; k <= N; k++) {
                if (peopleCheese[k][i]) cnt++;
            }

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}