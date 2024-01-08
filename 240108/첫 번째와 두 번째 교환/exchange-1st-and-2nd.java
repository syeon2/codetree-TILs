import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char first = str.charAt(0);
        char second = str.charAt(1);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == first) System.out.print(second);
            else if (str.charAt(i) == second) System.out.print(first);
            else System.out.print(str.charAt(i));
        }
    }
}