import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        String changedStr = str;

        bw.write(str + "\n");
        do {
            changedStr = changedStr.substring(changedStr.length() - 1) + changedStr.substring(0, changedStr.length() - 1);

            bw.write(changedStr + "\n");
        } while(!str.equals(changedStr));

        bw.flush();
        bw.close();
    }
}