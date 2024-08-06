import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        boolean isTrue = false;
        for (int i = a; i <= b; i++) {
            if (1920 % i == 0 && 2880 % i == 0) isTrue = true;
        }

        if (isTrue) bw.write("1");
        else bw.write("0");
        bw.flush();
        bw.close();
    }
}