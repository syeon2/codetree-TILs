import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String ans = "";
        int cnt = 1;

        char temp = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                cnt++;
            } else {
                ans = ans + "" + String.valueOf(temp) + "" + cnt;

                temp = str.charAt(i);
                cnt = 1;
            }
        }

        ans = ans + "" + String.valueOf(temp) + "" + cnt;

        System.out.println(ans.length());
        System.out.println(ans);
    }
}