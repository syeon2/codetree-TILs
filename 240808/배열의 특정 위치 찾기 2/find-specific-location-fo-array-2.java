import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");

        int even = 0;
        int odd = 0;

        for (int i = 0; i < list.length; i++) {
            int num = Integer.parseInt(list[i]);

            if (i % 2 == 0) even += num;
            else odd += num;
        }

        if (even > odd) bw.write(String.valueOf(even - odd));
        else bw.write(String.valueOf(odd - even));

        bw.flush();
        bw.close();
    }
}