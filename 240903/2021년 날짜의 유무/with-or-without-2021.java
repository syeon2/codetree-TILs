import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int M = Integer.parseInt(list[0]);
        int D = Integer.parseInt(list[1]);

        if (isTrue(M, D)) bw.write("Yes");
        else bw.write("No");

        bw.flush();
        bw.close();
    }

    public static boolean isTrue(int m, int d) {
        if (m == 2 && d <= 28) return true;
        else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d <= 31) return true;
        else if ((m == 4 || m == 6 || m == 9 || m == 11) && d <= 30) return true;

        return false;
    }
}