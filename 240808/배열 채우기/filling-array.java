import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int[] nums = new int[10];
        int cnt = -1;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(list[i]);

            if (num == 0) break;
            else {
                nums[i] = num;
                cnt++;
            }
        }

        for (int i = cnt; i >= 0; i--) {
            bw.write(String.valueOf(nums[i]));
            bw.write(" ");
        }

        bw.flush();
        bw.close();
    }
}