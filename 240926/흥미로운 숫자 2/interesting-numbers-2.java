import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int X = Integer.parseInt(strs[0]);
        int Y = Integer.parseInt(strs[1]);

        int cnt = 0;
        for (int i = X; i <= Y; i++) {
            if (isExcited(i)) cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }

    public static boolean isExcited(int num) {
        int[] list = new int[10];

        while (num != 0) {
            int n = num % 10;

            list[n]++;

            num /= 10;
        }

        int one = 0;
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            if (list[i] == 1) one++;
            else if (list[i] == 0) temp++;
        }

        if (one == 1 && temp == 8) return true;
        else return false;
    }
}