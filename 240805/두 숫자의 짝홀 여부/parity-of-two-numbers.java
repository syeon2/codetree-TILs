import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        if (a % 2 == 0) bw.write("even");
        else bw.write("odd");

        bw.newLine();

        if (b % 2 == 0) bw.write("even");
        else bw.write("odd");

        bw.flush();
        bw.close();
    }
}