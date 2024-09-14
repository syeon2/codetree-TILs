import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Node[] list = new Node[N];
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);

            list[i] = new Node(x, y);
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < N - 1; i++) {
            int temp = 0;

            for (int k = 1; k < N; k++) {
                if (i == k) continue;

                if (i + 1 == k) {
                    int dist1 = Math.abs(list[k].x - list[k - 2].x);
                    int dist2 = Math.abs(list[k].y - list[k - 2].y);

                    temp += (dist1 + dist2);
                } else {
                    int dist1 = Math.abs(list[k].x - list[k - 1].x);
                    int dist2 = Math.abs(list[k].y - list[k - 1].y);

                    temp += (dist1 + dist2);
                }
            }

            ans = Math.min(ans, temp);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static class Node {

        public int x;
        public int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}