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
            list = br.readLine().split(" ");

            int cmd = Integer.parseInt(list[0]);

            if (cmd == 1) {
                int fIdx = Integer.parseInt(list[1]) - 1;
                int sIdx = Integer.parseInt(list[2]) - 1;

                if (fIdx > sIdx) {
                    int temp = fIdx;
                    fIdx = sIdx;
                    sIdx = temp;
                }

                char c1 = str.charAt(fIdx);
                char c2 = str.charAt(sIdx);

                str = str.substring(0, fIdx) + String.valueOf(c2) + str.substring(fIdx + 1, sIdx) + String.valueOf(c1) + str.substring(sIdx + 1);

                bw.write(str + "\n");
            } else {
                String c1 = list[1];
                String c2 = list[2];

                str = str.replaceAll(c1, c2);

                bw.write(str + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}