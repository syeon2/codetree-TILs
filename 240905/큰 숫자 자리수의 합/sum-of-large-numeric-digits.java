import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);

        int ans = getAns(a, b, c);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int getAns(int a, int b, int c) {
        int value = a * b * c;

        return recur(value);
    }

    public static int recur(int n) {
        if (n == 0) return 0;

        int value = n % 10;

        return recur(n / 10) + value;
    }
}