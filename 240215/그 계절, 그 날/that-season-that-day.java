import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        // 존재하는지 확인 -> 윤년인지 아닌지, 윤년일 때, 아닐 때
        // 계절 탐색

        if (isExistDay(Y, M, D)) System.out.print(getSeason(M));
        else System.out.print(-1);
    }

    public static boolean isExistDay(int Y, int M, int D) {
        if (isYunneon(Y)) return isExistDayWithYunneon(M, D);

        return isExistDayWithoutYunneon(M, D);
    }

    public static boolean isYunneon(int y) {
        if (y % 4 == 0 && y % 100 == 0 && y % 400 == 0) return true;
        else if (y % 4 == 0 && y % 100 == 0) return false;
        else if (y % 4 == 0) return true;

        return false;
    }

    public static boolean isExistDayWithYunneon(int m, int d) {
        if (m == 2) {
            if (d <= 29) return true;
            else return false;
        }

        if (m <= 7) {
            if (m % 2 == 1 && d <= 31) return true;
            else if (m % 2 == 0 && d <= 30) return true;

            return false;
        } else {
            if (m % 2 == 0 && d <= 31) return true;
            else if (m % 2 == 1 && d <= 30) return true;

            return false;
        }
    }

    public static boolean isExistDayWithoutYunneon(int m, int d) {
        if (m == 2) {
            if (d <= 28) return true;
            else return false;
        }

        if (m <= 7) {
            if (m % 2 == 1 && d <= 31) return true;
            else if (m % 2 == 0 && d <= 30) return true;

            return false;
        } else {
            if (m % 2 == 0 && d <= 31) return true;
            else if (m % 2 == 1 && d <= 30) return true;

            return false;
        }
    }

    public static String getSeason(int m) {
        if (m <= 2 || m >= 12) return "Winter";
        else if (m <= 5) return "Spring";
        else if (m <= 8) return "Summer";
        else return "Fall";
    }
}