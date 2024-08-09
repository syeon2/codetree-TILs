import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            String[] list = br.readLine().split(" ");
            for (int k = 0; k < 4; k++) {
                sum += Integer.parseInt(list[i]);
            }

            sb.append(sum).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}