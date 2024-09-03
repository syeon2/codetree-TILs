import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] list = br.readLine().split(" ");
        int n = Integer.parseInt(list[0]);
        int m = Integer.parseInt(list[1]);

        printAns(n, m);
    }

    public static void printAns(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                System.out.print(1);
            }

            System.out.println();
        }
    }
}