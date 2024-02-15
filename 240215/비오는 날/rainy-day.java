import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Data[] list = new Data[N];
        for (int i = 0; i < N; i++) {
            list[i] = new Data(sc.next(), sc.next(), sc.next());
        }

        int idx = -1;

        for (int i = 0; i < N; i++) {
            if (idx == -1 && list[i].weather.equals("Rain")) idx = i;
            else if (idx != -1 && list[idx].day.compareTo(list[i].day) > 0 && list[i].weather.equals("Rain")) idx = i;
        }

        list[idx].print();
    }

    public static class Data {
        public String day;
        public String dayOfWeek;
        public String weather;

        public Data(String day, String dayOfWeek, String weather) {
            this.day = day;
            this.dayOfWeek = dayOfWeek;
            this.weather = weather;
        }

        public void print() {
            System.out.printf("%s %s %s", this.day, this.dayOfWeek, this.weather);
        }
    }
}