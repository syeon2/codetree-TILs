import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String cmd = sc.next();

            if (cmd.equals("push_front")) {
                int num = sc.nextInt();

                list.addFirst(num);
            } else if (cmd.equals("push_back")) {
                int num = sc.nextInt();

                list.addLast(num);
            } else if (cmd.equals("pop_front")) {
                sb.append(list.pollFirst()).append("\n");
            } else if (cmd.equals("pop_back")) {
                sb.append(list.pollLast()).append("\n");
            } else if (cmd.equals("size")) {
                sb.append(list.size()).append("\n");
            } else if (cmd.equals("empty")) {
                if (cmd.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (cmd.equals("front")) {
                sb.append(list.peekFirst()).append("\n");
            } else {
                sb.append(list.peekLast()).append("\n");
            }
        }

        System.out.print(sb);
    }
}