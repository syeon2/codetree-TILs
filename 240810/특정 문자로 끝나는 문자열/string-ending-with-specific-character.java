import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = new String[10];
        for (int i = 0; i < 10; i++) {
            list[i] = br.readLine();
        }

        String str = br.readLine();

        boolean isEmpty = true;

        for (int i = 0; i < 10; i++) {
            if (list[i].charAt(list[i].length() - 1) == str.charAt(0)) {
                bw.write(list[i] + "\n");
                isEmpty = false;
            }
        }

        if (isEmpty) bw.write("None");

        bw.flush();
        bw.close();
    }
}