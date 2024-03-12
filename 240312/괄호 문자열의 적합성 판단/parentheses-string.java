import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] list = sc.next().toCharArray();

        Stack<Character> stack = new Stack<>();

        boolean ans = true;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == '(') stack.add('(');
            else {
                if (stack.isEmpty()) {
                    ans = false;
                    break;
                } else stack.pop();
            }
        }

        if (!stack.isEmpty()) ans = false;

        if (ans) System.out.print("Yes");
        else System.out.print("No");
    }
}