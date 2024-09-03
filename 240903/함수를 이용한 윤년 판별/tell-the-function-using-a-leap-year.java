import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(isYunYear(n)));
        bw.flush();
        bw.close();
    }

    public static boolean isYunYear(int n) {
        if (n % 4 != 0 || (n % 100 == 0 && n % 400 != 0)) return false;
        else return true;
    }
}