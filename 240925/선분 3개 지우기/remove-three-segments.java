import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Line[] list = new Line[N];

        int[] line = new int[101];

        for (int n = 0; n < N; n++) {
            String[] strs = br.readLine().split(" ");

            int x1 = Integer.parseInt(strs[0]);
            int x2 = Integer.parseInt(strs[1]);

            list[n] = new Line(x1, x2);
            
            for (int x = x1; x <= x2; x++) {
                line[x]++;
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {

            for (int k = i + 1; k < N; k++) {

                for (int j = k + 1; j < N; j++) {
                    int[] temp = new int[101];

                    for (int x = 0; x < 101; x++) {
                        temp[x] = line[x];
                    }

                    int x1 = list[i].x1;
                    int x2 = list[i].x2;

                    int x3 = list[k].x1;
                    int x4 = list[k].x2;

                    int x5 = list[j].x1;
                    int x6 = list[j].x2;

                    for (int x = x1; x <= x2; x++) {
                        temp[x]--;
                    }

                    for (int x = x3; x <= x4; x++) {
                        temp[x]--;
                    }

                    for (int x = x5; x <= x6; x++) {
                        temp[x]--;
                    }

                    boolean isCross = false;

                    for (int x = 0; x < 101; x++) {
                        if (temp[x] > 1) isCross = true;
                    }

                    if (!isCross) ans++;
                }
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static class Line {

        public int x1;
        public int x2;

        public Line(int x1, int x2) {
            this.x1 = x1;
            this.x2 = x2;
        }
    }
}