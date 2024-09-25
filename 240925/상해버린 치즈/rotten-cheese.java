import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");

        int N = Integer.parseInt(strs[0]);
        int M = Integer.parseInt(strs[1]);
        int D = Integer.parseInt(strs[2]);
        int S = Integer.parseInt(strs[3]);

        FRecord[] fList = new FRecord[D];
        SRecord[] sList = new SRecord[S];

        for (int d = 0; d < D; d++) {
            strs = br.readLine().split(" ");

            int p = Integer.parseInt(strs[0]);
            int m = Integer.parseInt(strs[1]);
            int t = Integer.parseInt(strs[2]);

            fList[d] = new FRecord(p, m, t);
        }

        for (int s = 0; s < S; s++) {
            strs = br.readLine().split(" ");

            int p = Integer.parseInt(strs[0]);
            int t = Integer.parseInt(strs[1]);

            sList[s] = new SRecord(p, t);
        }

        boolean[] cheeses = new boolean[M + 1];

        for (int i = 1; i <= M; i++) {

            boolean isRotten = true;

            for (int k = 0; k < S; k++) {
                boolean temp = false;

                int person = sList[k].p;
                int time = sList[k].t;

                for (int j = 0; j < D; j++) {
                    if (person == fList[j].p && time > fList[j].t && i == fList[j].m) {
                        temp = true;
                        break;
                    }
                }

                if (!temp) isRotten = false;
            }

            if (isRotten) cheeses[i] = true;
        }

        int ans = 0;
        for (int i = 1; i <= M; i++) {
            if (!cheeses[i]) continue;

            boolean[] people = new boolean[N + 1];

            for (int k = 0; k < D; k++) {
                if (fList[k].m == i) {
                    people[fList[k].p] = true;
                }
            }

            int temp = 0;

            for (int k = 0; k <= N; k++) {
                if (people[k]) temp++;
            }

            ans = Math.max(ans, temp);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static class FRecord {
        public int p;
        public int m;
        public int t;

        public FRecord(int p, int m, int t) {
            this.p = p;
            this.m = m;
            this.t = t;
        }
    }

    public static class SRecord {
        public int p;
        public int t;

        public SRecord(int p, int t) {
            this.p = p;
            this.t = t;
        }
    }
}