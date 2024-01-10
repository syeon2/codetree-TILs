import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String fullDay = sc.next();
        String dayOfWeek = sc.next();
        String weather = sc.next();

        String[] dayList = splitDay(fullDay);

        Day dayClass = new Day(Integer.parseInt(dayList[0]), Integer.parseInt(dayList[1]), Integer.parseInt(dayList[2]), dayOfWeek, weather);

        for (int i = 0; i < N - 1; i++) {
            String[] list = splitDay(sc.next());
            int year = Integer.parseInt(list[0]);
            int month = Integer.parseInt(list[1]);
            int day = Integer.parseInt(list[2]);

            String dayOfWeek2 = sc.next();
            String weather2 = sc.next();

            if (weather2.equals("Rain")) {
                if (dayClass.isFirstYear(year) && dayClass.getWeather().equals("Rain")) continue;
                if (dayClass.isFirstMonth(month) && dayClass.getWeather().equals("Rain")) continue;
                if (dayClass.isFirstDays(day) && dayClass.getWeather().equals("Rain")) continue;

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