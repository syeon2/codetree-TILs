import java.io.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] cmds = br.readLine().toCharArray();

        int curX = 0;
        int curY = 0;

        int curDir = 0;

        int ans = -1;
        int cnt = 0;
        for (int i = 0; i < cmds.length; i++) {
            if (cmds[i] == 'F') {
                curX += dx[curDir];
                curY += dy[curDir];
            } else curDir = turnDir(cmds[i], curDir);

            cnt++;
            
            if (curX == 0 && curY == 0) {
                ans = cnt;
                break;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int turnDir(char c, int dir) {
        if (c == 'L') return (4 + (dir - 1)) % 4;
        
        return (dir + 1) % 4;
    }
}