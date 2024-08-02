import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());

        bw.write(str);
        bw.newLine();
        bw.write(String.format("%.2f", a));
        bw.newLine();
        bw.write(String.format("%.2f", b));

        bw.flush();
        bw.close();
    }
}