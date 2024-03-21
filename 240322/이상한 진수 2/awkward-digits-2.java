import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        int ans = 0;

        for (int i = 0; i < list.length; i++) {
            int temp = 0;

            for (int k = 0; k < list.length; k++) {
                int num = list[k] - '0';

                if (i == k) {
                    if (num == 1) num = 0;
                    else num = 1;
                }

                temp = (temp * 2) + num;
            }

            ans = Math.max(ans, temp);
        }

        System.out.println(ans);
    }
}