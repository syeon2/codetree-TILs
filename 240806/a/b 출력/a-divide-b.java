import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        // 기존 값 나누기
        int div = a / b;
        sb.append(div).append(".");

        // 나눈 나머지를 소수점부터 계속 나누기
        int remain = (a % b) * 10;

        for (int i = 0; i < 20; i++) {
            int value = remain / b;

            sb.append(value);
            remain = (remain % b) * 10;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}