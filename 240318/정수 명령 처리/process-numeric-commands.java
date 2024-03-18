import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int n = 0; n < N; n++) {
            String cmd = sc.next();

            if (cmd.equals("push")) {
                int num = sc.nextInt();

                stack.add(num);
            } else if (cmd.equals("pop")) {
                System.out.println(stack.pop());
            } else if (cmd.equals("size")) {
                System.out.println(stack.size());
            } else if (cmd.equals("empty")) {
                if (stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else {
                System.out.println(stack.peek());
            }
        }
    }
}