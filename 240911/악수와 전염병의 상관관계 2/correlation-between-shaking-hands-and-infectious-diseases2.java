import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");

        int N = Integer.parseInt(list[0]); // 개발자 수
        int K = Integer.parseInt(list[1]); // 감염시킬 수 있는 횟수
        int P = Integer.parseInt(list[2]); // 첫 감염자
        int T = Integer.parseInt(list[3]); // Proceed 수

        Proceed[] proceedList = new Proceed[251];
        Person[] people = new Person[N + 1];

        for (int i = 0; i < T; i++) {
            list = br.readLine().split(" ");

            int t = Integer.parseInt(list[0]);
            int x = Integer.parseInt(list[1]);
            int y = Integer.parseInt(list[2]);

            proceedList[t] = new Proceed(t, x, y);
        }

        for (int i = 1; i <= N; i++) {
            people[i] = new Person(i, K);
        }

        people[P].isInfected = 1;

        for (int i = 0; i < 251; i++) {
            if (proceedList[i] == null) continue;

            Person x = people[proceedList[i].x];
            Person y = people[proceedList[i].y];

            if (x.isInfected == 0 && y.isInfected == 0) continue;

            if (x.isInfected == 1 && x.infectCnt > 0 && y.isInfected == 0) {
                y.isInfected = 1;
                x.infectCnt--;

                continue;
            }

            if (y.isInfected == 1 && y.infectCnt > 0 && x.isInfected == 0) {
                x.isInfected = 1;
                y.infectCnt--;

                continue;
            }

            x.infectCnt--;
            y.infectCnt--;
        }

        for (int i = 1; i <= N; i++) {
            bw.write(String.valueOf(people[i].isInfected));
        }

        bw.flush();
        bw.close();
    }

    public static class Proceed {

        public int t;
        public int x;
        public int y;

        public Proceed(int t, int x, int y) {
            this.t = t;
            this.x = x;
            this.y = y;
        }
    }

    public static class Person {

        public int num;
        public int isInfected; // 0 음성, 1 양성
        public int infectCnt;

        public Person(int num, int infectCnt) {
            this.num = num;
            this.isInfected = 0;
            this.infectCnt = infectCnt;
        }
    }
}