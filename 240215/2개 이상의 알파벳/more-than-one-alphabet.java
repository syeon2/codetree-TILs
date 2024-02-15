import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (func(str)) System.out.print("Yes");
        else System.out.print("No");
    }

    public static boolean func(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0) != str.charAt(i)) return true;
        }

        return false;
    }
}