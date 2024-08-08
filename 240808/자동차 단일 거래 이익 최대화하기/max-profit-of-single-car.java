import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");

        int ans = 0;

        for (int i = 0; i < list.length; i++) {
            int bDate = Integer.parseInt(list[i]);

            for (int k = i + 1; k < list.length; k++) {
                int sDate = Integer.parseInt(list[k]);

                if (ans < (sDate - bDate)) ans = sDate - bDate;    
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}