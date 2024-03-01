import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        int S = sc.nextInt();

        int[][] records = new int[D][3];
        for (int i = 0; i < D; i++) {
            int p = sc.nextInt();
            int m = sc.nextInt();
            int t = sc.nextInt();

            records[i][0] = p;
            records[i][1] = m;
            records[i][2] = t;
        }

        int[][] illRecords = new int[S][2];
        for (int i = 0; i < S; i++) {
            int p = sc.nextInt();
            int t = sc.nextInt();

            illRecords[i][0] = p;
            illRecords[i][1] = t;
        }

        int ans = 0;

        for (int i = 0; i < S; i++) {

            int person = illRecords[i][0];
            int time = illRecords[i][1];

            for (int k = 0; k < D; k++) {
                int eatPerson = records[k][0];
                int cheese = records[k][1];
                int eatTime = records[k][2];

                if (person == eatPerson && eatTime < time) {

                    boolean[] people = new boolean[N + 1];

                    for (int j = 0; j < D; j++) {
                        if (records[j][1] == cheese) {
                            int idx = records[j][0];

                            people[idx] = true;
                        }
                    }

                    int cnt = 0;
                    for (int l = 1; l < people.length; l++) {
                        if (people[l]) cnt++;
                    }

                    ans = Math.max(ans, cnt);
                }
            }
        }

        System.out.print(ans);
    }
}