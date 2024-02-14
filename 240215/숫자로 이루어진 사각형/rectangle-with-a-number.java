import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printSquare(N);
    }

    public static void printSquare(int n) {
        int cnt = 1;

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n; k++) {
                System.out.printf("%d ", cnt++);

                if (cnt == 10) cnt = 1;
            }

            System.out.println();
        }
    }
}