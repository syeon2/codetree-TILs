import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') System.out.print(str.charAt(i));
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                System.out.print((char) (str.charAt(i) - 'a' + 'A'));
            }
        }
    }
}