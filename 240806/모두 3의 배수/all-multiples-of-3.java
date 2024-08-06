import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isAllMultiple = true;

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num % 3 > 0) isAllMultiple = false;
        }

        if (isAllMultiple) bw.write("1");
        else bw.write("0");

        bw.flush();
        bw.close();
    }
}