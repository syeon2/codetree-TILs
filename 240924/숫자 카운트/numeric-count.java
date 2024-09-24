import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Node[] list = new Node[N];

        for (int n = 0; n < N; n++) {
            String[] strs = br.readLine().split(" ");

            int num = Integer.parseInt(strs[0]);
            int strike = Integer.parseInt(strs[1]);
            int ball = Integer.parseInt(strs[2]);

            list[n] = new Node(num, ball, strike);
        }

        int cnt = 0;
        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= 9; k++) {
                if (i == k) continue;

                for (int j = 1; j <= 9; j++) {
                    if (i == j || k == j) continue;

                    boolean cond = true;
                    for (int n = 0; n < N; n++) {
                        int num = (i * 100) + (k * 10) + j;

                        boolean result = validate(num, list[n]);

                        if (!result) cond = false;
                    }

                    if (cond) cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }

    public static boolean validate(int num, Node node) {
        int f1 = num / 100;
        int s1 = (num % 100) / 10;
        int t1 = num % 10;

        int f2 = node.num / 100;
        int s2 = (node.num % 100) / 10;
        int t2 = node.num % 10;

        int cntStrike = 0;
        if (f1 == f2) cntStrike++;
        if (s1 == s2) cntStrike++;
        if (t1 == t2) cntStrike++;

        int cntBall = 0;
        if (f1 == s2 || f1 == t2) cntBall++;
        if (s1 == f2 || s1 == t2) cntBall++;
        if (t1 == f2 || t1 == s2) cntBall++;

        if (cntStrike == node.strike && cntBall == node.ball) return true;
        else return false;
    }

    public static class Node {

        public int num;
        public int ball;
        public int strike;

        public Node (int num, int ball, int strike) {
            this.num = num;
            this.ball = ball;
            this.strike = strike;
        }
    }
}