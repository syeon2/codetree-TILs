import java.util.*;

public class Main {

    public static int[] dx = {0, 0, 0, -1, 1};
    public static int[] dy = {0, -1, 1, 0, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            HashMap<String, Integer> map = new HashMap<>();
            
            int N = sc.nextInt();
            int M = sc.nextInt();

            for (int i = 0; i < M; i++) {
                int R = sc.nextInt() - 1;
                int C = sc.nextInt() - 1;

                int direc = getDirec(sc.next().charAt(0));

                map.put(makeKey(C, R), direc);
            }

            int sec = 0;
            while (sec++ <= 2 * N) {
                Queue<String> delete = new LinkedList<>();
                HashMap<String, Integer> renewMap = new HashMap<>();

                for (String key : map.keySet()) {
                    int[] pos = parseKey(key);

                    int x = pos[0];
                    int y = pos[1];

                    int direc = map.get(key);

                    int nx = x + dx[direc];
                    int ny = y + dy[direc];

                    if (isRange(nx, ny, N)) {
                        if (renewMap.containsKey(makeKey(nx, ny))) delete.add(makeKey(nx, ny));
                        else renewMap.put(makeKey(nx, ny), direc);
                    } else {
                        if (renewMap.containsKey(makeKey(x, y))) delete.add(makeKey(x, y));
                        else renewMap.put(makeKey(x, y), turnDirec(direc));
                    }
                }

                while (!delete.isEmpty()) {
                    renewMap.remove(delete.remove());
                }

                map = renewMap;
            }

            int ans = map.size();

            System.out.println(ans);
        }
    }

    public static int[] parseKey(String str) {
        String[] list = str.split(",");

        int[] pos = new int[2];
        pos[0] = Integer.parseInt(list[0]);
        pos[1] = Integer.parseInt(list[1]);

        return pos;
    }

    public static String makeKey(int x, int y) {
        return x + "," + y;
    }

    public static int turnDirec(int direc) {
        if (direc == 1) return 2;
        else if (direc == 2) return 1;
        else if (direc == 3) return 4;
        else return 3;
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }

    public static int getDirec(char direc) {
        if (direc == 'U') return 1;
        else if (direc == 'D') return 2;
        else if (direc == 'L') return 3;
        else return 4;
    }
}