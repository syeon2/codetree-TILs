import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");

        int a = list[0].charAt(0);
        int b = list[1].charAt(0);

        int sum = a + b;
        int diff = Math.max(a, b) - Math.min(a, b);

        bw.write(sum + " " + diff);
        bw.flush();
        bw.close();
    }
}