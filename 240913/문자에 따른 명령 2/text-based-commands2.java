import java.io.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1}; // N, E, S, W
    public static int[] dy = {1, 0, -1, 0};

    public static int curDir = 0;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] list = br.readLine().toCharArray();

        int nx = 0;
        int ny = 0;

        for (int n = 0; n < list.length; n++) {
            if (list[n] == 'F') {
                nx = dx[curDir] + nx;
                ny = dy[curDir] + ny;
            } else {
                turnDir(list[n]);
            }
        }

        bw.write(nx + " " + ny);
        bw.flush();
        bw.close();
    }

    public static void turnDir(char c) {
        if (c == 'R') curDir = (curDir + 1) % 4;
        else curDir = (4 + (curDir - 1)) % 4;
    }
}