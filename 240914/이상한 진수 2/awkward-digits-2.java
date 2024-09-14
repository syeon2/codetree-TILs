import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] list = br.readLine().toCharArray();
        
        int max = 0;
        for (int i = 0; i < list.length; i++) {

            char value = (list[i] == '1') ? '0' : '1';
            int temp = 0;

            for (int k = 0; k < list.length; k++) {
                char v = (i == k) ? value : list[k];

                temp = (temp * 2) + (v - '0');
            }

            max = Math.max(max, temp);
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}