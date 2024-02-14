import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(cntNum(a, b));
    }

    public static int cntNum(int a, int b) {
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (isHave369(i) || isMultipleOf3(i)) cnt++;
        }

        return cnt;
    }

    public static boolean isHave369(int num) {
        boolean flag = false;

        while (num > 0) {
            int n = num % 10;

            if (n == 3 || n == 6 || n == 9) {
                flag = true;
                break;
            }

            num /= 10;
        }

        return flag;
    }

    public static boolean isMultipleOf3(int num) {
        if (num % 3 == 0) return true;
        else return false;
    }
}