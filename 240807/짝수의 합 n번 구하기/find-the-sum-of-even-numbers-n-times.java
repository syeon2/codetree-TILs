import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] list = br.readLine().split(" ");
            int a = Integer.parseInt(list[0]);
            int b = Integer.parseInt(list[1]);

            int sum = 0;
            for (int k = a; k <= b; k++) {
                if (k % 2 == 0) sum += k;
            }

            sb.append(sum).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}