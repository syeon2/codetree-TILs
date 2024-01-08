import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        print(N);
    }

    public static void print(int n) {
        int cnt = 1;

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n; k++) {
                System.out.printf("%d ", cnt);

                cnt++;

                if (cnt == 10) cnt = 1;
            }

            System.out.println();
        }
    }
}