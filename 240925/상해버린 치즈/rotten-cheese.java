import java.io.*;
import java.util.*;

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

        boolean[] people = new boolean[N + 1];
        boolean[] cheeses = new boolean[M + 1];
        
        Node[] time = new Node[D];
        for (int d = 0; d < D; d++) {
            strs = br.readLine().split(" ");

            int p = Integer.parseInt(strs[0]);
            int m = Integer.parseInt(strs[1]);
            int t = Integer.parseInt(strs[2]);

            time[d] = new Node(p, m, t);
        }

        Arrays.sort(time, (o1, o2) -> {
            return o1.time - o2.time;
        });

        for (int s = 0; s < S; s++) {
            strs = br.readLine().split(" ");

            int p = Integer.parseInt(strs[0]);
            int t = Integer.parseInt(strs[1]);

            for (int d = 0; d < D; d++) {
                if (time[d].person == p && time[d].time < t) {
                    int cheeseNum = time[d].cheese;

                    cheeses[cheeseNum] = true;
                }
            }
        }

        for (int d = 0; d < D; d++) {
            int cheeseNum = time[d].cheese;

            if (cheeses[cheeseNum]) {
                int personNum = time[d].person;

                people[personNum] = true;
            }
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (people[i]) ans++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static class Node {

        public int person;
        public int cheese;
        public int time;

        public Node(int person, int cheese, int time) {
            this.person = person;
            this.cheese = cheese;
            this.time = time;
        }
    }
}