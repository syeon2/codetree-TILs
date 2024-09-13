import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int dx = 0;
        int dy = 0;

        for (int n = 0; n < N; n++) {
            String[] list = br.readLine().split(" ");

            String dir = list[0];
            int move = Integer.parseInt(list[1]);

            if (dir.equals("W")) dx -= move;
            else if (dir.equals("S")) dy -= move;
            else if (dir.equals("N")) dy += move;
            else dx += move;
        }

        bw.write(dx + " " + dy);
        bw.flush();
        bw.close();
    }
}