import java.io.*;

public class Main {

    public static int[] dx = {-1, 0, 0, 1};
    public static int[] dy = {0, -1, 1, 0};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int x = 0;
        int y = 0;

        for (int n = 0; n < N; n++) {
            String[] list = br.readLine().split(" ");

            String dir = list[0];
            int move = Integer.parseInt(list[1]);

            if (dir.equals("W")) x += (dx[0] * move);
            else if (dir.equals("S")) y += (dy[1] * move);
            else if (dir.equals("N")) y += (dy[2] * move);
            else x += (dx[3] * move);
        }

        bw.write(x + " " + y);
        bw.flush();
        bw.close();
    }
}