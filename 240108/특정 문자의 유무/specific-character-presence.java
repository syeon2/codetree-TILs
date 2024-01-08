import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String ee = "ee";
        String ab = "ab";

        String s = sc.next();

        boolean flag = false;

        for (int i = 0; i < s.length() - 2; i++) {

            boolean flag2 = true;

            for (int k = 0; k < ee.length(); k++) {
                if (s.charAt(i + k) != ee.charAt(k)) {
                    flag2 = false;
                    break;
                };
            }

            if (flag2) {
                flag = true;
                break;
            }
        }

        if (flag) System.out.print("Yes ");
        else System.out.print("No ");

        boolean flag3 = false;

        for (int i = 0; i < s.length() - 2; i++) {

            boolean flag4 = true;

            for (int k = 0; k < ab.length(); k++) {
                if (s.charAt(i + k) != ab.charAt(k)) {
                    flag4 = false;
                    break;
                }
            }

            if (flag4) {
                flag3 = true;
                break;
            }
        }

        if (flag3) System.out.print("Yes");
        else System.out.print("No");
    }
}