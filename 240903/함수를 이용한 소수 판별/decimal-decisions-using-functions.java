import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) sum += i;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}