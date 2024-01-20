import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int x = 0;
        int y = 0;

        for (int i = 0; i < N; i++) {
            String direction = sc.next();
            int move = sc.nextInt();

            if (direction.equals("N")) {
                y += move;
            } else if (direction.equals("E")) {
                x += move;
            } else if (direction.equals("S")) {
                y -= move;
            } else {
                x -= move;
            }
        }

        System.out.printf("%d %d", x, y);
    }
}