import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        String str1 = list[0];
        String str2 = list[1];

        int idx = str1.indexOf(str2);

        if (idx == -1) bw.write("No");
        else bw.write(String.valueOf(idx));

        bw.flush();
        bw.close();
    }
}