import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        printStar(N);
    }

    public static void printStar(int n) {
        if (n == 0) return;

        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }

        System.out.println();

        printStar(n - 1);

        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}