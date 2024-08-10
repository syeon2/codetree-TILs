import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        String str = list[0];
        int q = Integer.parseInt(list[1]);

        for (int i = 0; i < q; i++) {
            int cmd = Integer.parseInt(br.readLine());

            if (cmd == 1) {
                str = str.substring(1) + str.substring(0, 1);

                bw.write(str + "\n");
            } else if (cmd == 2) {
                str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);

                bw.write(str + "\n");
            } else {
                str = new StringBuilder(str).reverse().toString();

                bw.write(str + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}