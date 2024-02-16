import java.util.Scanner;

public class Main {

    public static int[] color = new int[200001];
    public static int OFFSET = 100000;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int curPos = OFFSET;

        for (int n = 0; n < N; n++) {
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'L') {
                for (int i = curPos; i > curPos - move; i--) {
                    color[i] = 2;
                }

                curPos -= (move - 1);
            } else {
                for (int i = curPos; i < curPos + move; i++) {
                    color[i] = 1;
                }

                curPos += (move - 1);
            }
        }

        int black = 0;
        int white = 0;

        for (int i = 0; i < color.length; i++) {
            if (color[i] == 1) black++;
            else if (color[i] == 2) white++;
        }

        System.out.printf("%d %d", white, black);
        
    }
}