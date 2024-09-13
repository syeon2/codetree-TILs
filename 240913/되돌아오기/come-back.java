import java.io.*;

public class Main {

    public static int[] dx = {-1, 0, 0, 1};
    public static int[] dy = {0, -1, 1, 0};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int curX = 0;
        int curY = 0;

        boolean isReturn = false;
        int cnt = 0;

        while (N-- > 0) {
            String[] list = br.readLine().split(" ");

            int dir = getDir(list[0].charAt(0));
            int move = Integer.parseInt(list[1]);

            boolean temp = false;

            for (int i = 0; i < move; i++) {
                curX += dx[dir];
                curY += dy[dir];

                cnt++;

                if (curX == 0 && curY == 0) {
                    isReturn = true;
                    temp = true;

                    break;
                }
            }

            if (temp) break;
        }

        if (isReturn) bw.write(String.valueOf(cnt));
        else bw.write("-1");

        bw.flush();
        bw.close();
    }

    public static int getDir(char c) {
        if (c == 'W') return 0;
        else if (c == 'S') return 1;
        else if (c == 'N') return 2;
        else return 3;
    }
}