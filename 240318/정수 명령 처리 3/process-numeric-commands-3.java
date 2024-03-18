import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Deque<Integer> deq = new LinkedList<>();

        for (int n = 0; n < N; n++) {
            String cmd = sc.next();

            if (cmd.equals("push_front")) {
                int num = sc.nextInt();

                deq.addFirst(num);
            } else if (cmd.equals("push_back")) {
                int num = sc.nextInt();

                deq.addLast(num);
            } else if (cmd.equals("pop_front")) {
                System.out.println(deq.removeFirst());
            } else if (cmd.equals("pop_back")) {
                System.out.println(deq.removeLast());
            } else if (cmd.equals("size")) {
                System.out.println(deq.size());
            } else if (cmd.equals("empty")) {
                if (deq.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (cmd.equals("front")) {
                System.out.println(deq.peekFirst());
            } else {
                System.out.println(deq.peekLast());
            }
        }
    }
}