import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Queue<Pos> que = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ansY = sc.nextInt() - 1;
        int ansX = sc.nextInt() - 1;

        int value = board[ansY][ansX];
        que.add(new Pos(ansX, ansY));

        while (K-- > 0 && !que.isEmpty()) {
            Pos node = que.remove();

            int tempX = node.x;
            int tempY = node.y;

            int maxValue = 0;

            for (int i = 0; i < N; i++) {
                for (int k = 0; k < N; k++) {
                    if (i == tempY && k == tempX) continue;

                    if (board[i][k] < value && maxValue < board[i][k]) {
                        tempX = k;
                        tempY = i;
                        maxValue = board[i][k];
                    }
                }
            }

            que.add(new Pos(tempX, tempY));
            ansX = tempX;
            ansY = tempY;
            value = board[ansY][ansX];
        }

        System.out.printf("%d %d", ansY, ansX);
    }

    public static class Pos {
        public int x;
        public int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}