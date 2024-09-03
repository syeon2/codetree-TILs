import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isEven(i)) cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static boolean isEven(int n) {
        char[] list = String.valueOf(n).toCharArray();

        int sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum += (list[i] - '0');
        }

        return (sum % 2 == 0);
    }
}