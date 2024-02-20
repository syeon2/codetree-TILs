import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int cnt = 0;
        for (int i = X; i <= Y; i++) {
            if (isFal(i)) cnt++;
        }

        System.out.print(cnt);
    }

    public static boolean isFal(int n) {
        String str = String.valueOf(n);

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        }

        return true;
    }
}