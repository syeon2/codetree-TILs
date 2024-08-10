import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        String str = String.valueOf(sum);
        str = str.substring(1) + str.substring(0, 1);

        bw.write(str);
        bw.flush();
        bw.close();
    }
}