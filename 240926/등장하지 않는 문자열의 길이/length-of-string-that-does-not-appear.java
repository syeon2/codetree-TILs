import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        char[] list = br.readLine().toCharArray();

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            boolean isExist = false;

            for (int k = 0; k <= N - i; k++) {
                for (int j = k + i; j <= N - i; j++) {

                    boolean temp = true;
                    for (int l = 0; l < i; l++) {
                        if (list[k + l] != list[j + l]) temp = false;
                    }

                    if (temp) {
                        isExist = true;
                        break;
                    }
                }

                if (isExist) break;
            }

            if (!isExist) {
                ans = i;
                break;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}