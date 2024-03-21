import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        int ans = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] != '(') continue;

            for (int k = i + 1; k < list.length; k++) {
                if (list[k] == ')') ans++;
            }
        }

        System.out.print(ans);
    }
}