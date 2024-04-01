import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int C;
    public static int[][] board;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        C = sc.nextInt();

        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        int ans = 0;

        for (int r1 = 0; r1 < N; r1++) {
            for (int c1 = 0; c1 <= N - M; c1++) {

                for (int r2 = 0; r2 < N; r2++) {
                    for (int c2 = 0; c2 <= N - M; c2++) {
                        if (r1 != r2) {
                            List<Integer> list1 = new ArrayList<>();
                            int sum1 = permutation(c1, r1, list1, 0);

                            List<Integer> list2 = new ArrayList<>();
                            int sum2 = permutation(c2, r2, list2, 0);

                            ans = Math.max(ans, sum1 + sum2);
                        } else {
                            int startX1 = c1;
                            int endX1 = c1 + M - 1;

                            int startX2 = c2;
                            int endX2 = c2 + M - 1;

                            if ((startX1 <= startX2 && endX1 >= startX2) || (startX2 <= startX1 && endX2 >= startX1) || (startX1 == startX2)) {
                                continue;
                            } else {
                                List<Integer> list1 = new ArrayList<>();
                                int sum1 = permutation(c1, r1, list1, 0);

                                List<Integer> list2 = new ArrayList<>();
                                int sum2 = permutation(c2, r2, list2, 0);

                                ans = Math.max(ans, sum1 + sum2);
                            }
                        }
                    }
                }
            }
        }

        System.out.print(ans);
    }

    public static int permutation(int x, int y, List<Integer> list, int idx) {
        if (idx == M) {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }

            if (sum > C) return 0;
            else {
                int ans = 0;
                for (int i = 0; i < list.size(); i++) {
                    ans += (list.get(i) * list.get(i));
                }

                return ans;
            }
        }

        list.add(board[y][x + idx]);
        int sum1 = permutation(x, y, list, idx + 1);
        list.remove(list.size() - 1);
        int sum2 = permutation(x, y, list, idx + 1);

        return Math.max(sum1, sum2);
    }
}