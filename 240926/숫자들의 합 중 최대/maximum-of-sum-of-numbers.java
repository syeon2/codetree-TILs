import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int X = Integer.parseInt(strs[0]);
        int Y = Integer.parseInt(strs[1]);

        int ans = 0;
        for (int i = X; i <= Y; i++) {
            ans = Math.max(ans, sum(i));
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int sum(int num) {
        char[] list = String.valueOf(num).toCharArray();

        int temp = 0;
        for (int i = 0; i < list.length; i++) {
            temp += (list[i] - '0');
        }

        return temp;
    }
}