import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        if (isYunneon(y)) System.out.print("true");
        else System.out.print("false");
    }

    public static boolean isYunneon(int y) {
        if (y % 4 == 0 && y % 100 == 0 && y % 400 == 0) return true;
        else if (y % 4 == 0 && y % 100 == 0) return false;
        else if (y % 4 == 0) return true;
        else return false;
    }
}