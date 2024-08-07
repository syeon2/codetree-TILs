import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int f = Integer.parseInt(list[0]);
        int s = Integer.parseInt(list[1]);

        int[] nList = new int[10];
        nList[0] = f;
        nList[1] = s;

        for (int i = 0; i < 10; i++) {
            if (i < 2) bw.write(String.format("%d ", nList[i]));
            else {
                nList[i] = nList[i - 1] + (nList[i - 2] * 2);

                bw.write(String.format("%d ", nList[i]));
            }
        }

        bw.flush();
        bw.close();
    }
}