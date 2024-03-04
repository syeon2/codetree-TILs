import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        boolean[][] board = new boolean[11][11];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            board[y][x] = true;
        }

        int ans = 0;

        // x <= 3 && y == 0
        for (int i = 0; i < 11; i++) {
            for (int k = 0; k < 11; k++) {
                for (int l = 0; l < 11; l++) {
                    boolean[][] copyBoard = copy(board);

                    for (int y = 0; y < 11; y++) {
                        copyBoard[y][i] = false;
                        copyBoard[y][k] = false;
                        copyBoard[y][l] = false;
                    }

                    boolean flag = true;

                    for (int y = 0; y < 11; y++) {
                        for (int x = 0; x < 11; x++) {
                            if (copyBoard[y][x]) flag = false;
                        }
                    }

                    if (flag) ans = 1;
                }
            }
        }

        // x == 2 && y == 1

        for (int i = 0; i < 11; i++) {
            for (int k = 0; k < 11; k++) {
                for (int l = 0; l < 11; l++) {
                    boolean[][] copyBoard = copy(board);

                    for (int y = 0; y < 11; y++) {
                        copyBoard[y][i] = false;
                        copyBoard[y][k] = false;
                    }

                    for (int x = 0; x < 11; x++) {
                        copyBoard[l][x] = false;
                    }

                    boolean flag = true;

                    for (int y = 0; y < 11; y++) {
                        for (int x = 0; x < 11; x++) {
                            if (copyBoard[y][x]) flag = false;
                        }
                    }

                    if (flag) ans = 1;
                }
            }
        }

        // x == 1 && y == 2
        for (int i = 0; i < 11; i++) {
            for (int k = 0; k < 11; k++) {
                for (int j = 0; j < 11; j++) {
                    boolean[][] copyBoard = copy(board);

                    for (int y = 0; y < 11; y++) {
                        copyBoard[y][i] = false;
                    }

                    for (int x = 0; x < 11; x++) {
                        copyBoard[k][x] = false;
                        copyBoard[j][x] = false;
                    }

                    boolean flag = true;

                    for (int y = 0; y < 11; y++) {
                        for (int x = 0; x < 11; x++) {
                            if (copyBoard[y][x]) flag = false;
                        }
                    }

                    if (flag) ans = 1;
                }
            }
        }

        for (int i = 0; i < 11; i++) {
            for (int k = 0; k < 11; k++) {
                for (int l = 0; l < 11; l++) {
                    boolean[][] copyBoard = copy(board);

                    for (int x = 0; x < 11; x++) {
                        copyBoard[i][x] = false;
                        copyBoard[k][x] = false;
                        copyBoard[l][x] = false;
                    }

                    boolean flag = true;

                    for (int y = 0; y < 11; y++) {
                        for (int x = 0; x < 11; x++) {
                            if (copyBoard[y][x]) flag = false;
                        }
                    }

                    if (flag) ans = 1;
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean[][] copy(boolean[][] origin) {
        boolean[][] tempBoard = new boolean[11][11];

        for (int i = 0; i < 11; i++) {
            for (int k = 0; k < 11; k++) {
                tempBoard[i][k] = origin[i][k];
            }
        }

        return tempBoard;
    }
}