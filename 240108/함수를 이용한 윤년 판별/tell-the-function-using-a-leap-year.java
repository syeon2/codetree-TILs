import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        if (isYunYear(y)) System.out.print(true);
        else System.out.print(false);
    }

    public static boolean isYunYear(int n) {
        boolean flag = false;

        if (n % 4 == 0) flag = true;
        if (n % 4 == 0 && n % 100 == 0) flag = false;
        if (n % 4 == 0 && n % 100 == 0 && n % 400 == 0) flag = true;

        return flag;
    }
}