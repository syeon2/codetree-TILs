import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        int ans = 0;

        for (int i = 1; i < list.length - 1; i++) {
            if (list[i - 1] == '(' && list[i] == '(') {

                for (int k = i + 1; k < list.length - 1; k++) {
                    if (list[k] == ')' && list[k + 1] == ')') ans++;
                }
            }
        }

        System.out.print(ans);
    }
}