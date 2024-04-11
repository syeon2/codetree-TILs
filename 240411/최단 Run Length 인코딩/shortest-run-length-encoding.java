import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int len = str.length() + 1;

        int ans = 100;

        while (len-- > 0) {
            StringBuilder sb = new StringBuilder();

            String renewStr = str.substring(str.length() - 1).concat(str.substring(0, str.length() - 1));

            int cnt = 1;
            char value = renewStr.charAt(0);

            for (int i = 1; i < renewStr.length(); i++) {
                if (value == renewStr.charAt(i)) cnt++;
                else {
                    sb.append(value).append(cnt);
                    cnt = 1;
                    value = renewStr.charAt(i);
                }
            }

            sb.append(value).append(cnt);

            ans = Math.min(ans, sb.toString().length());

            str = renewStr;
        }

        System.out.print(ans);
    }
}