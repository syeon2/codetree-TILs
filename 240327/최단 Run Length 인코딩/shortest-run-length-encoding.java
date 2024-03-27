import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] base = sc.next().toCharArray();

        int ans = 10;

        int L = base.length;

        while (L-- > 0) {
            char temp = base[base.length - 1];
            for (int i = base.length - 1; i >= 1; i--) {
                base[i] = base[i - 1];
            }
            base[0] = temp;

            StringBuilder sb = new StringBuilder();

            char value = 'a';
            int cnt = 1;

            for (int i = 0; i < base.length; i++) {
                if (i == 0) value = base[i];
                else {
                    if (value == base[i]) cnt++;
                    else {
                        sb.append(value).append(cnt);
                        value = base[i];
                        cnt = 1;
                    }
                }
            }

            sb.append(value).append(cnt);

            String compressWord = sb.toString();

            int len = compressWord.length();

            ans = Math.min(ans, len);
        }

        System.out.print(ans);
    }
}