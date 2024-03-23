import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // people
        int M = sc.nextInt(); // cheese
        int D = sc.nextInt(); // eatRecords
        int S = sc.nextInt(); // illRecords

        boolean[] people = new boolean[N + 1];
        int[] cheeses = new int[M + 1];
        int[][] eatRecords = new int[D][3]; // p, m, t
        int[][] illRecords = new int[S][2]; // p, t

        for (int d = 0; d < D; d++) {
            int p = sc.nextInt();
            int m = sc.nextInt();
            int t = sc.nextInt();

            eatRecords[d][0] = p;
            eatRecords[d][1] = m;
            eatRecords[d][2] = t;
        }

        for (int s = 0; s < S; s++) {
            int p = sc.nextInt();
            int t = sc.nextInt();

            illRecords[s][0] = p;
            illRecords[s][1] = t;
        }

        for (int s = 0; s < S; s++) {
            int sickPerson = illRecords[s][0];
            int sickSeconds = illRecords[s][1];

            for (int d = 0; d < D; d++) {
                int eatPerson = eatRecords[d][0];
                int eatenCheese = eatRecords[d][1];
                int eatSeconds = eatRecords[d][2];

                if (eatPerson == sickPerson && sickSeconds > eatSeconds) cheeses[eatenCheese]++;
            }
        }

        for (int i = 1; i < cheeses.length; i++) {
            if (cheeses[i] != S) continue;

            for (int d = 0; d < D; d++) {
                int eatPerson = eatRecords[d][0];
                int eatenCheese = eatRecords[d][1];

                if (eatenCheese == i) people[eatPerson] = true;
            }
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (people[i]) ans++;
        }

        System.out.print(ans);
    }
}