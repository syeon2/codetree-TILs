import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int B = Integer.parseInt(strs[1]);

        Node[] list = new Node[N];

        for (int n = 0; n < N; n++) {
            strs = br.readLine().split(" ");

            int p = Integer.parseInt(strs[0]);
            int s = Integer.parseInt(strs[1]);

            list[n] = new Node(p, s);
        }

		Arrays.sort(list, (o1, o2) -> {
			int price1 = (o1.p / 2) + o1.s;
			int price2 = (o2.p / 2) + o2.s;

			if (price1 > price2) {
				return 1;
			} else if (price2 > price1) {
				return -1;
			} else {
                if (o1.s >= o2.s) {
                    return 1;
                } else return -1;
            }
		});

        int ans = 0;

        for (int i = 0; i < N; i++) {
            int tempB = B;

            for (int k = 0; k < N; k++) {

                if (i == k) tempB -= ((list[k].p / 2) + list[k].s);
                else tempB -= (list[k].p + list[k].s);

                if (tempB >= 0) {
                    ans = Math.max(ans, k + 1);
                } else break;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static class Node {

        public int p;
        public int s;

        public Node(int p, int s) {
            this.p = p;
            this.s = s;
        }
    }
}