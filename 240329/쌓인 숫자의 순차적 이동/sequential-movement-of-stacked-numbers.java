import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Point[][] board = new Point[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                Point point = new Point();
                
                point.idx += 1;
                point.list[point.idx] = sc.nextInt();

                board[i][k] = point;
            }
        }

        for (int m = 0; m < M; m++) {
            int findValue = sc.nextInt();

            boolean isEnd = false;

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    Point point = board[r][c];

                    int maximumIdx = point.idx;
                    int[] pointList = point.list;

                    for (int i = 0; i <= maximumIdx; i++) {
                        if (pointList[i] == findValue) {

                            int maxValue = -1;
                            int maxX = -1;
                            int maxY = -1;
                            Point maxPoint = null;

                            for (int k = 0; k < 8; k++) {
                                int nx = c + dx[k];
                                int ny = r + dy[k];

                                if (isRange(nx, ny, N)) {
                                    Point compPoint = board[ny][nx];
                                    int[] compList = compPoint.list;
                                    int compIdx = compPoint.idx;
                                    
                                    for (int j = 0; j <= compIdx; j++) {
                                        if (compList[j] > maxValue) {
                                            maxValue = compList[j];
                                            maxX = nx;
                                            maxY = ny;
                                            maxPoint = compPoint;
                                        }
                                    }
                                }
                            }

                            if (maxValue == -1) {
                                isEnd = true;
                                break;
                            } else {
                                int[] nextList = maxPoint.list;

                                for (int k = i; k <= maximumIdx; k++) {
                                    maxPoint.idx += 1;
                                    nextList[maxPoint.idx] = pointList[k];
                                    pointList[k] = 0;
                                    point.idx -= 1;
                                }

                                isEnd = true;
                                break;
                            }
                        }
                    }

                    if (isEnd) break;
                }

                if (isEnd) break;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                Point point = board[i][k];
                if (point.idx == -1) System.out.println("None");
                else {
                    int[] pointList = point.list;

                    for (int j = point.idx; j >= 0; j--) {
                        System.out.printf("%d ", pointList[j]);
                    }

                    System.out.println();
                }
            }
        }
    }

    public static class Point {
        public int[] list = new int[101];
        public int idx = -1;
    }

    public static boolean isRange(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;

        return false;
    }
}