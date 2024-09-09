import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        String n = br.readLine();

        int ans = convertInt(a, n);

        bw.write(convertB(b, ans));
        bw.flush();
        bw.close();
    }

    public static String convertB(int b, int n) {
        StringBuilder sb = new StringBuilder();

        do {
            sb.append(n % b);

            n /= b;
        } while (n != 0);

        return sb.reverse().toString();
    }

    public static int convertInt(int a, String n) {
        int ans = 0;

        for (int i = 0; i < n.length(); i++) {
            ans = (ans * a) + (n.charAt(i) - '0');
        }

        return ans;
    }
}