import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        boolean[] isNotPrime = new boolean[101];
        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; i <= 100; i++) {

            for (int k = i + i; k <= 100; k += i) {
                isNotPrime[k] = true;
            }
        }

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (!isNotPrime[i]) sum += i;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}