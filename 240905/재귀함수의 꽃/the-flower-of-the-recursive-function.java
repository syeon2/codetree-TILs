import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        printNum(N);
    }

    public static void printNum(int N) {
        if (N == 0) return;

        System.out.print(N + " ");

        printNum(N - 1);

        System.out.print(N + " ");
    }
}