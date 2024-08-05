import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        int aM = Integer.parseInt(a[0]);
        int aE = Integer.parseInt(a[1]);

        String[] b = br.readLine().split(" ");
        int bM = Integer.parseInt(b[0]);
        int bE = Integer.parseInt(b[1]);

        if (aM > bM) bw.write("A");
        else if (aM == bM && aE > bE) bw.write("A");
        else bw.write("B");

        bw.flush();
        bw.close(); 
    }
}