import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);

        boolean isTrue = false;

        for (int i = a; i <= b; i++) {
            if (i % c == 0) isTrue = true;
        }

        if (isTrue) bw.write("YES");
        else bw.write("NO");

        bw.flush();
        bw.close();
    }
}