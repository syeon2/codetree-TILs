import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (haveThreePos(i)) cnt++;
        }

        System.out.print(cnt);
    }

    public static boolean haveThreePos(int num) {
        if (num % 3 == 0) return true;

        boolean flag = false;

        while (num != 0) {
            int temp = num % 10;

            if (temp == 3 || temp == 6 || temp == 9) {
                flag = true;
                break;
            }

            num /= 10;
        }

        return flag;
    }
}