import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (n != 1) {
            if (n % 2 == 0) n /= 2;
            else n = (n * 3) + 1;

            cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}