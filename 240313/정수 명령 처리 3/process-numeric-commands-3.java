import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Deque<Integer> deque = new LinkedList<>();
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String cmd = sc.next();

            if (cmd.equals("push_front")) {
                int num = sc.nextInt();

                deque.addFirst(num);
            } else if (cmd.equals("push_back")) {
                int num = sc.nextInt();

                deque.addLast(num);
            } else if (cmd.equals("pop_front")) {
                sb.append(deque.pollFirst()).append("\n");
            } else if (cmd.equals("pop_back")) {
                sb.append(deque.pollLast()).append("\n");
            } else if (cmd.equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if (cmd.equals("empty")) {
                if (deque.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (cmd.equals("front")) {
                sb.append(deque.peekFirst()).append("\n");
            } else {
                sb.append(deque.peekLast()).append("\n");
            }
        }

        System.out.print(sb);
    }
}