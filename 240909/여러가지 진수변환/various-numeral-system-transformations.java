import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int N = Integer.parseInt(list[0]);
        int B = Integer.parseInt(list[1]);

        bw.write(String.valueOf(convert(N, B)));
        bw.flush();
        bw.close();
    }

    public static int convert(int n, int b) {
        StringBuilder sb = new StringBuilder();

        do {
            sb.append(n % b);

            n /= b;
        } while (n != 0);

        return Integer.parseInt(sb.reverse().toString());
    }
}