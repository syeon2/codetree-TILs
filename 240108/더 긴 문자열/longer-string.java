import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() > s2.length()) {
            System.out.println(s1 + " " + (s1.length()));
        } else if (s1.length() < s2.length()) {
            System.out.println(s2 + " " + (s2.length()));
        } else System.out.println("same");
    }
}