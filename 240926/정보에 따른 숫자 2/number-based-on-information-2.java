import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int T = Integer.parseInt(strs[0]);
        int a = Integer.parseInt(strs[1]);
        int b = Integer.parseInt(strs[2]);

        Node[] list = new Node[T];
        for (int t = 0; t < T; t++) {
            strs = br.readLine().split(" ");

            char alp = strs[0].charAt(0);
            int pos = Integer.parseInt(strs[1]);

            list[t] = new Node(alp, pos);
        }

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            int d1 = 1001;
            int d2 = 1001;

            for (int k = 0; k < T; k++) {
                if (list[k].alp == 'S') d1 = Math.min(d1, Math.abs(i - list[k].pos));
                else if (list[k].alp == 'N') d2 = Math.min(d2, Math.abs(i - list[k].pos));
            }

            if (d1 <= d2) cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }

    public static class Node {

        public char alp;
        public int pos;

        public Node(char alp, int pos) {
            this.alp = alp;
            this.pos = pos;
        }
    }
}