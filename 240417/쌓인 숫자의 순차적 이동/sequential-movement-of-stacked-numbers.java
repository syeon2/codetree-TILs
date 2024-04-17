import java.util.*;

public class Main {

    public static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
    public static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static int N;
    public static int M;

    public static Stack<Integer>[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        board = new Stack[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = new Stack<>();
                board[r][c].add(sc.nextInt());
            }
        }

        for (int m = 0; m < M; m++) {
            boolean changed = false;
            int num = sc.nextInt();

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {

                    Stack<Integer> stack = board[r][c];

                    for (int i = 0; i < stack.size(); i++) {
                        if (stack.get(i) == num) {
                            simulate(c, r, num);
                            changed = true;
                            break;
                        }
                    }

                    if (changed) break;
                }

                if (changed) break;
            }
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {

                if (board[r][c].isEmpty()) System.out.println("None");
                else {
                    while (!board[r][c].isEmpty()) {
                        System.out.printf("%d ", board[r][c].pop());
                    }

                    System.out.println();
                }
            }
        }
    }

    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;
        return false;
    }

    public static void simulate(int x, int y, int num) {
        int maxValue = 0;
        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny) && !board[ny][nx].isEmpty()) {
                Stack<Integer> stack = board[ny][nx];

                for (int k = 0; k < stack.size(); k++) {
                    if (stack.get(k) > maxValue) {
                        maxValue = stack.get(k);
                        maxX = nx;
                        maxY = ny;
                    }
                }
            }
        }

        if (maxValue == 0) return;
        else {
            Stack<Integer> container = new Stack<>();
            while (true) {
                Stack<Integer> baseStack = board[y][x];

                int removeNum = baseStack.pop();

                container.add(removeNum);
                if (removeNum == num) break;
            }

            while (!container.isEmpty()) {
                board[maxY][maxX].add(container.pop());
            }
        }
    }
}