import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int cnt = 1;

        String newString = String.valueOf(s.charAt(0));

        if (s.length() != 1) {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i - 1) != s.charAt(i)) {
                    newString = newString + "" + cnt + "" + s.charAt(i);

                    cnt = 1;
                } else cnt++;
            }
        }

        newString = newString + "" + cnt;

        System.out.print(newString.length() + "\n" + newString);
    }
}