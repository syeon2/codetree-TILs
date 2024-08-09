import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            String[] list = br.readLine().split(" ");

            for (int k = 0; k <= i; k++) {
                sum += Integer.parseInt(list[k]);    
            }
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}