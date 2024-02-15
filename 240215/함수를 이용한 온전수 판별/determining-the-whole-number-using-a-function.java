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
            if (isNum(i)) cnt++;
        }

        return cnt;
    }

    public static boolean isNum(int num) {
        if (num % 2 == 1 && num % 10 != 5 && !(num % 3 == 0 && num % 9 > 0)) return true;

        return false;
    }
}