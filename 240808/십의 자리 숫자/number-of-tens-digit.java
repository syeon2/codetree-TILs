import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] list = br.readLine().split(" ");

        int[] nList = new int[10];

        for (int i = 0; i < list.length; i++) {
            int num = Integer.parseInt(list[i]);

            if (num == 0) break;

            int idx = num / 10;
            nList[idx]++;
        }

        for (int i = 1; i < 10; i++) {
            sb.append(i).append(" - ").append(nList[i]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}