import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String s = sc.next();

        int idx = -1;

        for (int i = 0; i < str.length() - s.length() + 1; i++) {

            boolean flag = true;

            for (int k = 0; k < s.length(); k++) {
                if (str.charAt(i + k) != s.charAt(k)) flag = false;
            }

            if (flag) {
                idx = i;
                break;
            }
        }

        System.out.print(idx);
    }
}