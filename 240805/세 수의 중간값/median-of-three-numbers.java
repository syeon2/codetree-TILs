import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);

        if (b > a && b < c) bw.write("1");
        else bw.write("0");

        bw.flush();
        bw.close();
    }
}