import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[2001][2001];
        int offset = 1000;

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();   

        for (int i = Math.min(x1, x2); i < Math.max(x1, x2); i++) {

            for (int k = Math.min(y1, y2); k < Math.max(y1, y2); k++) {
                board[k + offset][i + offset]++;
            }
        }

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        for (int i = Math.min(x3, x4); i < Math.max(x3, x4); i++) {
            for (int k = Math.min(y3, y4); k < Math.max(y3, y4); k++) {
                board[k + offset][i + offset]--;
            }
        }

        int minX = 2001;
        int minY = 2001;
        int maxX = -1;
        int maxY = -1;

        boolean flag = false;

        for (int i = 0; i < board.length; i++) {

            for (int k = 0; k < board[i].length; k++) {
                if (board[i][k] >= 1) {
                    flag = true;

                    if (i < minY) minY = i;
                    if (i > maxY) maxY = i;
                    if (k < minX) minX = k;
                    if (k > maxX) maxX = k;
                }
            }
        }

        int subX = maxX - minX;
        int subY = maxY - minY;

        if (flag) System.out.print((subX + 1) * (subY + 1));
        else System.out.print(0);
    }
}