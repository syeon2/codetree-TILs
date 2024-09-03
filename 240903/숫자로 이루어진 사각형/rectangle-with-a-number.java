import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        printAns(n);
    }

    public static void printAns(int n) {
        int cnt = 1;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                System.out.print((cnt++) + " ");

                if (cnt == 10) cnt = 1;
            }

            System.out.println();
        }
    }
}