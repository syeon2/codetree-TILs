import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        printStar(1, N);
    }

    public static void printStar(int start, int N) {
        if (start > N) return;

        for (int i = 1; i <= start; i++) {
            System.out.print("*");
        }

        System.out.println();

        printStar(start + 1, N);
    }
}