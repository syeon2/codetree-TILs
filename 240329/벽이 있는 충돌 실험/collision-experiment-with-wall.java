import java.util.*;
import java.io.*;

public class Main {

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            HashMap<String, Integer> map = new HashMap<>();
            
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());

                int R = Integer.parseInt(st.nextToken()) - 1;
                int C = Integer.parseInt(st.nextToken()) - 1;

                int direc = getDirec(st.nextToken().charAt(0));

                map.put(makeKey(C, R), direc);
            }

            int sec = 0;
            while (sec++ < 2 * N) {
                int[][] memo = new int[N][N];
                HashMap<String, Integer> renewMap = new HashMap<>();

                for (String key : map.keySet()) {
                    int[] pos = parseKey(key);

                    int x = pos[0];
                    int y = pos[1];

                    int direc = map.get(key);

                    int nx = x + dx[direc];
                    int ny = y + dy[direc];

                    if (isRange(nx, ny, N)) {
                        memo[ny][nx] += 1;

                        if (memo[ny][nx] > 1) renewMap.remove(makeKey(nx, ny));
                        else renewMap.put(makeKey(nx, ny), direc);
                    } else {
                        memo[y][x] += 1;

                        if (memo[y][x] > 1) renewMap.remove(makeKey(x, y));
                        else renewMap.put(makeKey(x, y), turnDirec(direc));
                    }
                }

                map = renewMap;
            }

            int ans = map.size();

            sb.append(ans).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int[] parseKey(String str) {
        StringTokenizer st = new StringTokenizer(str);

        int[] pos = new int[2];
        pos[0] = Integer.parseInt(st.nextToken());
        pos[1] = Integer.parseInt(st.nextToken());

        return pos;
    }

    public static String makeKey(int x, int y) {
        StringBuilder sb = new StringBuilder();
        sb.append(x).append(" ").append(y);

        return sb.toString();
    }

    public static int turnDirec(int direc) {
        if (direc == 0) return 1;
        else if (direc == 1) return 0;
        else if (direc == 2) return 3;
        else return 2;
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int getDirec(char direc) {
        if (direc == 'U') return 0;
        else if (direc == 'D') return 1;
        else if (direc == 'L') return 2;
        else return 3;
    }
}