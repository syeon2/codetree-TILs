import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        if (str.contains("ee")) bw.write("Yes ");
        else bw.write("No ");

        if (str.contains("ab")) bw.write("Yes ");
        else bw.write("No ");

        bw.flush();
        bw.close();

    }
}