import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        Date[] list = new Date[N];
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");

            list[i] = new Date(str[0], str[1], str[2]);
        }

        Date ans = null;

        for (int i = 0; i < N; i++) {
            if (ans == null && list[i].weather.equals("Rain")) ans = list[i];
            else if (ans != null && ans.date.compareTo(list[i].date) > 0 && list[i].weather.equals("Rain")) ans = list[i];
        }

        ans.printAns();
    }

    public static class Date {

        public String date;
        public String dayOfWeek;
        public String weather;

        public Date(String date, String dayOfWeek, String weather) {
            this.date = date;
            this.dayOfWeek = dayOfWeek;
            this.weather = weather;
        }

        public void printAns() {
            System.out.println(date + " " + dayOfWeek + " " + weather);
        }
    }
}