import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = {"L", "E", "B", "R", "O", "S"};
        String str = br.readLine();

        int idx = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(str)) {
                idx = i;
                break;
            }
        }

        if (idx == -1) bw.write("None");
        else bw.write(String.valueOf(idx));

        bw.flush();
        bw.close();
    }
}