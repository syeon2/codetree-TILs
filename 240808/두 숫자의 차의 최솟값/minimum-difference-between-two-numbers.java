import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int n1 = Integer.parseInt(list[i + 1]);
            int n2 = Integer.parseInt(list[i]);

            int temp = n1 - n2;

            if (temp < min) min = temp;
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }
}