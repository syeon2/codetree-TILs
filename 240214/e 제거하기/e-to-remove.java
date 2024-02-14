import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                str = str.substring(0, i).concat(str.substring(i + 1));
                break;
            }
        }

        System.out.print(str);
    }
}