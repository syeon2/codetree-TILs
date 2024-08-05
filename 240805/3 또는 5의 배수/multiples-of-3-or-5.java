import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        if (a % 3 == 0) bw.write("YES");
        else bw.write("NO");

        bw.newLine();

        if (a % 5 == 0) bw.write("YES");
        else bw.write("NO");

        bw.flush();
        bw.close();
    }
}