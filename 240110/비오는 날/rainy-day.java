import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Day dayClass = null;

        for (int i = 0; i < N; i++) {
            String[] list = splitDay(sc.next());
            int year = Integer.parseInt(list[0]);
            int month = Integer.parseInt(list[1]);
            int day = Integer.parseInt(list[2]);

            String dayOfWeek2 = sc.next();
            String weather2 = sc.next();

            if (dayClass == null && weather2.equals("Rain")) {
                dayClass = new Day(year, month, day, dayOfWeek2, weather2);
                continue;
            }

            if (weather2.equals("Rain")) {
                if (dayClass.isFirstYear(year)) continue;
                if (dayClass.isFirstMonth(month)) continue;
                if (dayClass.isFirstDays(day)) continue;

                dayClass = new Day(year, month, day, dayOfWeek2, weather2);
            }
        }

        dayClass.print();
    }

    public static String[] splitDay(String fullDay) {
        return fullDay.split("-");
    }

    public static class Day {
        private int year;
        private int month;
        private int days;

        private String dayOfWeek;
        private String weather;

        public Day(int year, int month, int days, String dayOfWeek, String weather) {
            this.year = year;
            this.month = month;
            this.days = days;
            this.dayOfWeek = dayOfWeek;
            this.weather = weather;
        }

        public boolean isFirstYear(int year) {
            if (this.year < year) return true;
            else return false;
        }

        public boolean isFirstMonth(int month) {
            if (this.month < month) return true;
            else return false;
        }

        public boolean isFirstDays(int days) {
            if (this.days < days) return true;
            else return false;
        }

        public String getWeather() {
            return this.weather;
        }

        public void print() {
            System.out.printf("%d-", year);
            if (month < 10) System.out.printf("0%d-", month);
            else System.out.printf("%d-", month);
            if (days < 10) System.out.printf("0%d ", days);
            else System.out.printf("%d ", days);

            System.out.printf("%s ", dayOfWeek);
            System.out.printf("%s ", weather);
        }
    }
}