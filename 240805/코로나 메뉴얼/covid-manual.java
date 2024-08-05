import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        String aflu = a[0];
        int atem = Integer.parseInt(a[1]);

        String[] b = br.readLine().split(" ");
        String bflu = b[0];
        int btem = Integer.parseInt(b[1]);

        String[] c = br.readLine().split(" ");
        String cflu = c[0];
        int ctem = Integer.parseInt(c[1]);

        int count = 0;

        if (aflu.equals("Y") && atem >= 37) count++;
        if (bflu.equals("Y") && btem >= 37) count++;
        if (cflu.equals("Y") && ctem >= 37) count++;

        if (count >= 2) bw.write("E");
        else bw.write("N");

        bw.flush();
        bw.close();
    }
}