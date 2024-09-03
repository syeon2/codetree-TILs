import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(getAns(n));
        bw.flush();
        bw.close();
    }

    public static String getAns(int n) {
        if (n % 2 == 0 && getSum(n) % 5 == 0) return "Yes";
        else return "No";
    }

    public static int getSum(int n) {
        char[] list = String.valueOf(n).toCharArray();

        return (list[0] - '0') + (list[1] - '0');
    }
}