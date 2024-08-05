import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        int aAge = Integer.parseInt(a[0]);
        String aGender = a[1];

        String[] b = br.readLine().split(" ");
        int bAge = Integer.parseInt(b[0]);
        String bGender = b[1];

        if ((aAge >= 19 && aGender.equals("M")) || (bAge >= 19 && bGender.equals("M"))) bw.write("1");
        else bw.write("0");

        bw.flush();
        bw.close();
    }
}