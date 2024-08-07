import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");

        int first = Integer.parseInt(list[0]);
        int second = Integer.parseInt(list[1]);

        int[] nums = new int[10];
        nums[0] = first;
        nums[1] = second;

        for (int i = 0; i < nums.length; i++) {
            if (i < 2) bw.write(String.format("%d ", nums[i]));
            else {
                nums[i] = (nums[i - 1] + nums[i - 2]) % 10;

                bw.write(String.format("%d ", nums[i]));
            }
        }

        bw.flush();
        bw.close();
    }
}