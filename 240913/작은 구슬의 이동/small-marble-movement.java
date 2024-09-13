import java.io.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");

        int N = Integer.parseInt(list[0]);
        int T = Integer.parseInt(list[1]);

        list = br.readLine().split(" ");

        int R = Integer.parseInt(list[0]);
        int C = Integer.parseInt(list[1]);
        int curDir = getDir(list[2].charAt(0));

        while (T-- > 0) {
            int nx = C + dx[curDir];
            int ny = R + dy[curDir];

            if (isRange(nx, ny, N)) {
                C = nx;
                R = ny;
            } else curDir = turnReverse(curDir);
        }

        bw.write(R + " " + C);
        bw.flush();
        bw.close();
    }

    public static int turnReverse(int dir) {
        return (dir + 2) % 4;
    }

    public static int getDir(char c) {
        if (c == 'U') return 0;
        else if (c == 'D') return 2;
        else if (c == 'R') return 1;
        else return 3;
    }

    public static boolean isRange(int x, int y, int N) {
        return (x >= 1 && x <= N && y >= 1 && y <= N);
    }
}