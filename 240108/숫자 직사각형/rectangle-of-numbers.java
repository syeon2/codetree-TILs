import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int cnt = 1;

        for (int i = 0; i < x; i++) {

            for (int k = 0; k < y; k++) {
                System.out.printf("%d ", cnt++);
            }

            System.out.println();
        }
    }
}