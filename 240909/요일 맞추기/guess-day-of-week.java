import java.io.*;

public class Main {

    public static int[] monthes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] dayOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int m1 = Integer.parseInt(list[0]);
        int d1 = Integer.parseInt(list[1]);
        int m2 = Integer.parseInt(list[2]);
        int d2 = Integer.parseInt(list[3]);

        int days = numOfDay(m2, d2) - numOfDay(m1, d1);

        if (days >= 0) {
            days %= 7;

            bw.write(dayOfWeek[days]);
        } else {
            days = 7 - (Math.abs(days) % 7);

            bw.write(dayOfWeek[days]);
        }

        bw.flush();
        bw.close();
    }

    public static int numOfDay(int m, int d) {
        int days = 0;
        for (int i = 1; i < m; i++) {
            days += monthes[i];
        }

        days += d;

        return days;
    }
}