import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        int aMath = Integer.parseInt(a[0]);
        int aEng = Integer.parseInt(a[1]);

        String[] b = br.readLine().split(" ");
        int bMath = Integer.parseInt(b[0]);
        int bEng = Integer.parseInt(b[1]);

        if (aMath > bMath && aEng > bEng) bw.write("1");
        else bw.write("0");

        bw.flush();
        bw.close();
    }
}