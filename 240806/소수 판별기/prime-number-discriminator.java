import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) isPrime = false;
        }

        if (isPrime) bw.write("P");
        else bw.write("C");

        bw.flush();
        bw.close();
    }
}