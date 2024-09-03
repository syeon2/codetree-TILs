import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int y = Integer.parseInt(list[0]);
        int m = Integer.parseInt(list[1]);
        int d = Integer.parseInt(list[2]);

        if (!isTrue(y, m, d)) {
            bw.write("-1");
        } else {
            if (m >= 3 && m <= 5) bw.write("Spring");
            else if (m >= 6 && m <= 8) bw.write("Summer");
            else if (m >= 9 && m <= 11) bw.write("Fall");
            else bw.write("Winter");
        }

        bw.flush();
        bw.close();
    }

    public static boolean isTrue(int y, int m, int d) {
        if (m == 2 && isYun(y) && d <= 29) return true;
        else if (m == 2 && !isYun(y) && d <= 28) return true;
        else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d <= 31) return true;
        else if ((m == 4 || m == 6 || m == 9 || m == 11) && d <= 31) return true;

        return false;
    }

    public static boolean isYun(int y) {
        if (y % 4 == 0 && (y % 100 == 0 && y % 400 == 0)) return true;
        else if (y % 4 == 0 && y % 100 == 0) return false;
        else if (y % 4 == 0) return true;

        return false;
    }
}