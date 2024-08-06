import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        boolean isComp = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) isComp = true;
        }

        if (isComp) bw.write("C");
        else bw.write("N");

        bw.flush();
        bw.close();
    }
}