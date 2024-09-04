import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] nList = new int[N];
        String[] list = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nList[i] = Integer.parseInt(list[i]);
        }

        changeValues(nList);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(nList[i]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void changeValues(int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) list[i] /= 2;
        }
    }
}