import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'A' && c <= 'Z') System.out.print((char) (c - 'A' + 'a'));
            else if (c >= 'a' && c <= 'z') System.out.print((char) c);
            else if (c >= '1' && c <= '9') System.out.print(c);
        }
    }
}