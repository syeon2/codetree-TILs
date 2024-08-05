import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Double a = Double.parseDouble(br.readLine());
        Double b = Double.parseDouble(br.readLine());

        if (a >= 1.0 && b >= 1.0) bw.write("High");
        else if (a >= 0.5 && b >= 0.5) bw.write("Middle");
        else bw.write("Low");

        bw.flush();
        bw.close();
    }
}