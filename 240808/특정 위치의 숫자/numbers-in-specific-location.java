import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] list = br.readLine().split(" ");

        int three = Integer.parseInt(list[2]);
        int five = Integer.parseInt(list[4]);
        int ten = Integer.parseInt(list[9]);

        bw.write(String.format("%d", three + five + ten));
        bw.flush();
        bw.close();
    }
}