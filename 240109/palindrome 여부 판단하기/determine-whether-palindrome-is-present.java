import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (str.equals(reverse(str))) System.out.print("Yes");
        else System.out.print("No");
    }

    public static String reverse(String str) {
        char[] list = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            list[str.length() - 1 - i] = str.charAt(i);
        }

        return String.valueOf(list);
    }
}