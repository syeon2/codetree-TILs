import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] list = br.readLine().split(" ");
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Double.parseDouble(list[i]);
        }

        double avg = sum / n;

        bw.write(String.format("%.1f", avg));
        bw.newLine();

        if (avg >= 4.0) bw.write("Perfect");
        else if (avg >= 3.0) bw.write("Good");
        else bw.write("Poor");

        bw.flush();
        bw.close();

    }
}