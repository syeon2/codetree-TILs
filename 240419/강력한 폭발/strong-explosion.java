import java.util.*;

public class Main {

    public static int[][] dx = {{0, 0, 0, 0, 0}, {0, -1, 0, 1, 0}, {-1, 1, 0, -1, 1}};
    public static int[][] dy = {{-2, -1, 0, 1, 2}, {-1, 0, 0, 0, 1}, {-1, -1, 0, 1, 1}};

    public static int N;
    public static List<Integer[]> list = new ArrayList<>();

    public static int[] kindOfBomb;

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                int num = sc.nextInt();

                if (num == 1) {
                    Integer[] pos = {c, r};
                    list.add(pos);
                }
            }
        }

        kindOfBomb = new int[list.size()];

        perm(0);

        System.out.print(ans);
    }

    public static void perm(int depth) {
        if (depth == list.size()) {
            countBombArea();

            return;
        }

        for (int i = 0; i < 3; i++) {
            kindOfBomb[depth] = i;
            perm(depth + 1);
        }
    }

    public static void countBombArea() {
        int[][] temp = new int[N][N];

        for (int i = 0; i < kindOfBomb.length; i++) {
            int x = list.get(i)[0];
            int y = list.get(i)[1];

            int bombNum = kindOfBomb[i];

            for (int k = 0; k < 5; k++) {
                int nx = x + dx[bombNum][k];
                int ny = y + dy[bombNum][k];

                if (isRange(nx, ny)) {
                    temp[ny][nx] = 1;
                }
            }
        }

        int cnt = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                cnt += temp[r][c];
            }
        }

        ans = Math.max(ans, cnt);
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}