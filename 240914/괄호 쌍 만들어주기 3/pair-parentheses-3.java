import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] list = br.readLine().toCharArray();

        int ans = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == ')') continue;
            
            for (int k = i; k < list.length; k++) {
                if (list[k] == ')') ans++;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}