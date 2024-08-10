import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();

        String ab = a.concat(b);
        String ba = b.concat(a);

        if (ab.equals(ba)) bw.write("true");
        else bw.write("false");

        bw.flush();
        bw.close();
    }
}