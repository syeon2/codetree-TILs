import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        if (isExistDay(M, D)) System.out.print("Yes");
        else System.out.print("No");
    }

    public static boolean isExistDay(int m, int d) {
        if (m == 2 && d <= 28) return true;
        if (m == 2 && d >= 29) return false;

        if (m <= 7 && m % 2 == 1 && d <= 31) return true;
        if (m <= 7 && m % 2 == 0 && d <= 30) return true;

        if (m >= 8 && m <= 12 && m % 2 == 0 && d <= 31) return true;
        if (m >= 8 && m <= 12 && m % 2 == 1 && d <= 30) return true;

        return false;
    }
}