import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        int S = sc.nextInt();

        boolean[] people = new boolean[N + 1];
        boolean[][] peopleCheese = new boolean[N + 1][M + 1];
        boolean[] cheeses = new boolean[M + 1];

        int[][] eatRecords = new int[D][3];
        int[][] sickRecords = new int[S][2];

        for (int n = 0; n < D; n++) {
            eatRecords[n][0] = sc.nextInt();
            eatRecords[n][1] = sc.nextInt();
            eatRecords[n][2] = sc.nextInt();
        }

        for (int n = 0; n < S; n++) {
            sickRecords[n][0] = sc.nextInt();
            sickRecords[n][1] = sc.nextInt();
        }

        for (int i = 0; i < S; i++) {
            int sickPerson = sickRecords[i][0];
            int sickTime = sickRecords[i][1];

            for (int k = 0; k < D; k++) {
                int eatPerson = eatRecords[k][0];
                int eatenCheese = eatRecords[k][1];
                int eatTime = eatRecords[k][2];

                if (eatPerson == sickPerson && sickTime > eatTime) {
                    people[sickPerson] = true;
                    peopleCheese[sickPerson][eatenCheese] = true;
                    cheeses[eatenCheese] = true;
                }
            }
        }

        int ans = 0;

        for (int i = 1; i <= M; i++) {
            int cheese = i;

            if (cheeses[cheese]) {
                int cnt = 0;

                for (int k = 1; k <= N; k++) {
                    int person = k;

                    if (people[person] && peopleCheese[person][cheese]) cnt++;
                }

                if (cnt == S) {
                    boolean[] tempPeople = new boolean[N + 1];

                    for (int k = 0; k < D; k++) {
                        int eatPerson = eatRecords[k][0];
                        int eatenCheese = eatRecords[k][1];

                        if (eatenCheese == cheese) tempPeople[eatPerson] = true;
                    }

                    int eatCnt = 0;
                    for (int k = 1; k <= N; k++) {
                        if (tempPeople[k]) eatCnt++;
                    }

                    ans = Math.max(ans, eatCnt);
                }
            }
        }

        System.out.print(ans);
    }
}