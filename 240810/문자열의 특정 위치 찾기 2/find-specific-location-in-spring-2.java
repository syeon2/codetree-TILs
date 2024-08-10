import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = {"apple", "banana", "grape", "blueberry", "orange"};

        char c = br.readLine().charAt(0);

        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            if (list[i].charAt(2) == c || list[i].charAt(3) == c) {
                bw.write(list[i] + "\n");
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}