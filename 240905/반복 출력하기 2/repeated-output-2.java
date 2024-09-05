import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        printStr(N);
    }

    public static void printStr(int n) {
        if (n == 0) return;

        System.out.println("HelloWorld");

        printStr(n - 1);
    }
}