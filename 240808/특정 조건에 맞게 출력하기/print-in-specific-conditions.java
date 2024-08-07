import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] list = br.readLine().split(" ");

        for (int i = 0; i < list.length; i++) {
            int num = Integer.parseInt(list[i]);

            if (num == 0) break;
            else if (num % 2 == 0) bw.write(String.format("%d ", num / 2));
            else bw.write(String.format("%d ", num + 3));
        }

        bw.flush();
        bw.close();
    }
}