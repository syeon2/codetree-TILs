import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Day day = null;

        for (int i = 0; i < N; i++) {
            String days = sc.next();
            String dayOfWeek = sc.next();
            String weather = sc.next();

            if (day == null && isRain(weather)) day = new Day(days, dayOfWeek, weather);
            else if (day != null) {
                if (!day.isFirst(days) && isRain(weather)) day = new Day(days, dayOfWeek, weather);
            }
        }

        day.print();
    }

    public static boolean isRain(String weather) {
        if (weather.equals("Rain")) return true;
        else return false;
    }

    public static class Day {
        private String days;
        private String dayOfWeek;
        private String weather;

        public Day(String days, String dayOfWeek, String weather) {
            this.days = days;
            this.dayOfWeek = dayOfWeek;
            this.weather = weather;
        }

        public boolean isFirst(String days) {
            String[] list1 = this.days.split("-");
            String[] list2 = days.split("-");

            if (Integer.parseInt(list1[0]) < Integer.parseInt(list2[0])) return true;
            else if (Integer.parseInt(list1[0]) > Integer.parseInt(list2[0])) return false;

            if (Integer.parseInt(list1[1]) < Integer.parseInt(list2[1])) return true;
            else if (Integer.parseInt(list1[1]) > Integer.parseInt(list2[1])) return false;

            if (Integer.parseInt(list1[2]) < Integer.parseInt(list2[2])) return true;
            else if (Integer.parseInt(list1[2]) > Integer.parseInt(list2[2])) return false;

            return true;
        }

        public void print() {
            System.out.printf("%s %s %s", days, dayOfWeek, weather);
        }
    }
}