import java.io.*;

public class Main {

    public static int[] monthes = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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

        String date = br.readLine();

        int diff = numOfDay(m2, d2) - numOfDay(m1, d1);

        int ans = (diff / 7);

        int remain = (diff % 7);
        for (int i = 0; i <= remain; i++) {
            if (dayOfWeek[i].equals(date)) ans++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int numOfDay(int m, int d) {
        int days = 0;
        for (int i = 1; i < m; i++) {
            days += monthes[i];
        }

        return (days + d);
    }
}