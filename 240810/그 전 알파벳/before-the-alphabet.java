import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char c = br.readLine().charAt(0);

        if (c == 'a') bw.write("z");
        else bw.write(String.valueOf((char) (c - 1)));

        bw.flush();
        bw.close();
    }
}