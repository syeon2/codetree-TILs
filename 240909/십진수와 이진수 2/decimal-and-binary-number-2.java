import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();

        int ans = convertInt(N);

        ans *= 17;

        bw.write(convertBinary(ans));
        bw.flush();
        bw.close();
    }

    public static String convertBinary(int n) {
        StringBuilder sb = new StringBuilder();

        do {
            sb.append(n % 2);

            n /= 2;
        } while (n != 0);

        return sb.reverse().toString();
    }

    public static int convertInt(String n) {
        int ans = 0;

        for (int i = 0; i < n.length(); i++) {
            ans = (ans * 2) + (n.charAt(i) - '0');
        }

        return ans;
    }
}