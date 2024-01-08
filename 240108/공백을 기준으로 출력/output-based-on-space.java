import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') continue;
            else System.out.print(s.charAt(i));
        }

        String s2 = sc.nextLine();

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == ' ') continue;
            else System.out.print(s2.charAt(i));
        }
    }
}