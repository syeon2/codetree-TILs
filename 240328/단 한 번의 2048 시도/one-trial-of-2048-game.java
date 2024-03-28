import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                board[i][k] = sc.nextInt();
            }
        }

        char direc = sc.next().charAt(0);

        if (direc == 'L') {
            for (int r = 0; r < 4; r++) {
                int prevValue = 0;
                int prevIdx = 0;

                for (int c = 0; c < 4; c++) {
                    if (c == 0) prevValue = board[r][c];
                    else if (board[r][c] == 0) continue;
                    else {
                        if (prevValue == board[r][c]) {
                            board[r][prevIdx] *= 2;
                            board[r][c] = 0;
                            prevValue = 0;
                            prevIdx = -1;
                        } else {
                            prevValue = board[r][c];
                            prevIdx = c;
                        }
                    }
                }
            }

            for (int r = 0; r < 4; r++) {
                for (int c = 0; c < 4; c++) {
                    if (board[r][c] != 0) continue;

                    for (int i = c + 1; i < 4; i++) {
                        if (board[r][i] != 0) {
                            board[r][c] = board[r][i];
                            board[r][i] = 0;
                            break;
                        }
                    }
                }
            }
        } else if (direc == 'R') {
            for (int r = 0; r < 4; r++) {
                int prevValue = 0;
                int prevIdx = 3;

                for (int c = 3; c >= 0; c--) {
                    if (c == 3) prevValue = board[r][c];
                    else if (board[r][c] == 0) continue;
                    else {
                        if (prevValue == board[r][c]) {
                            board[r][prevIdx] *= 2;
                            board[r][c] = 0;
                            prevValue = 0;
                            prevIdx = -1;
                        } else {
                            prevValue = board[r][c];
                            prevIdx = c;
                        }
                    }
                }
            }

            for (int r = 0; r < 4; r++) {
                for (int c = 3; c >= 0; c--) {
                    if (board[r][c] != 0) continue;

                    for (int i = c - 1; i >= 0; i--) {
                        if (board[r][i] != 0) {
                            board[r][c] = board[r][i];
                            board[r][i] = 0;
                            break;
                        }
                    }
                }
            }
        } else if (direc == 'U') {
            for (int c = 0; c < 4; c++) {
                int prevValue = 0;
                int prevIdx = 0;

                for (int r = 0; r < 4; r++) {
                    if (r == 0) prevValue = board[r][c];
                    else if (board[r][c] == 0) continue;
                    else {
                        if (prevValue == board[r][c]) {
                            board[prevIdx][c] *= 2;
                            board[r][c] = 0;
                            prevValue = 0;
                            prevIdx = -1;
                        } else {
                            prevValue = board[r][c];
                            prevIdx = r;
                        }
                    }
                }
            }

            for (int c = 0; c < 4; c++) {
                for (int r = 0; r < 4; r++) {
                    if (board[r][c] != 0) continue;

                    for (int i = r + 1; i < 4; i++) {
                        if (board[i][c] != 0) {
                            board[r][c] = board[i][c];
                            board[i][c] = 0;
                            break;
                        }
                    }
                }
            }
        } else {
            for (int c = 0; c < 4; c++) {
                int prevValue = 0;
                int prevIdx = 0;

                for (int r = 3; r >= 0; r--) {
                    if (r == 0) prevValue = board[r][c];
                    else if (board[r][c] == 0) continue;
                    else {
                        if (prevValue == board[r][c]) {
                            board[prevIdx][c] *= 2;
                            board[r][c] = 0;
                            prevValue = 0;
                            prevIdx = -1;
                        } else {
                            prevValue = board[r][c];
                            prevIdx = c;
                        }
                    }
                }
            }

            for (int c = 0; c < 4; c++) {
                for (int r = 3; r >= 0; r--) {
                    if (board[r][c] != 0) continue;

                    for (int i = r - 1; i >= 0; i--) {
                        if (board[i][c] != 0) {
                            board[r][c] = board[i][c];
                            board[i][c] = 0;
                            break;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.printf("%d ", board[i][k]);
            }

            System.out.println();
        }
    }
}