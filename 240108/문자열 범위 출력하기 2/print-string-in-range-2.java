import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        char[] list = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            list[i] = s.charAt(i);
        }

        if (n > s.length()) {
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
        } else {
            for (int i = s.length() - 1; i > s.length() - 1 - 11; i--) {
               System.out.print(s.charAt(i));
            }
        }
        
    }
}