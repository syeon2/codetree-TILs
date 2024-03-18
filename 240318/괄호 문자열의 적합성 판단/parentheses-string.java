import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        int stack = 0;

        boolean ans = true;

        for (int i = 0; i < list.length; i++) {
            if (list[i] == '(') {
                stack++;
            } else {
                if (stack == 0) {
                    ans = false;
                    break;
                } else stack--;
            }
        }

        if (ans && stack == 0) System.out.print("Yes");
        else System.out.print("No");
    }
}