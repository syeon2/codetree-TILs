import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] list = new int[4];

        for (int i = 0; i < 3; i++) {
            String[] line = br.readLine().split(" ");

            String symptom = line[0];
            int tem = Integer.parseInt(line[1]);

            if (symptom.equals("Y") && tem >= 37) list[0]++;
            else if (symptom.equals("N") && tem >= 37) list[1]++;
            else if (symptom.equals("Y") && tem <= 36) list[2]++;
            else list[3]++;
        }

        bw.write(String.format("%d %d %d %d ", list[0], list[1], list[2], list[3]));
        if (list[0] >= 2) bw.write("E");

        bw.flush();
        bw.close();
    }
}