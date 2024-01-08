import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        for (int i = 0; i < str2.length(); i++) {
            if (i == 0 || i == 1) System.out.print(str1.charAt(i));
            else System.out.print(str2.charAt(i));
        }
    }
}