import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");

        int[] nList = new int[1001];
        for (int i = 0; i < list.length; i++) {
            int num = Integer.parseInt(list[i]);

            nList[num]++;
        }

        int max = -1;
        for (int i = 0; i < nList.length; i++) {
            if (nList[i] == 0 || nList[i] >= 2) continue;
            else max = i;
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}