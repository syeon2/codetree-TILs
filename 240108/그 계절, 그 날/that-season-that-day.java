import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        if (isExist(Y, M, D)) System.out.print(getSeason(M));
        else System.out.print(-1);
    }

    public static String getSeason(int m) {
        if (m >= 3 && m <= 5) return "Spring";
        else if (m >= 6 && m <= 8) return "Summer";
        else if (m >= 9 && m <= 11) return "Fall";
        else return "Winter";
    }

    public static boolean isExist(int y, int m, int d) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 11) {
            if (d > 31) return false;
            else return true;
        } else if (m == 2) {
            if (isYunYear(y) && d > 29) return false;
            else if (isYunYear(y) && d <= 29) return true;
            else if (!isYunYear(y) && d > 28) return false;
            else return true;
        } else {
            if (d > 30) return false;
            else return true;
        }
    }

    public static boolean isYunYear(int y) {
        boolean flag = false;

        if (y % 4 == 0) flag = true;
        if (y % 4 == 0 && y % 100 == 0) flag = false;
        if (y % 4 == 0 && y % 100 == 0 && y % 400 == 0) flag = true;

        return flag;
    }
}