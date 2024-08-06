import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int classroom = 0;
        int corridor = 0;
        int bathroom = 0;

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            cnt++;

            if (cnt % 12 == 0) bathroom++;
            else if (cnt % 3 == 0) corridor++;
            else if (cnt % 2 == 0) classroom++;
        }

        bw.write(classroom + " " + corridor + " " + bathroom);
        bw.flush();
        bw.close();
    }
}