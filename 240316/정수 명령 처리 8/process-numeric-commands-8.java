import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

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
                System.out.println(list.pollFirst());
            } else if (cmd.equals("pop_back")) {
                System.out.println(list.pollLast());
            } else if (cmd.equals("size")) {
                System.out.println(list.size());
            } else if (cmd.equals("empty")) {
                if (cmd.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (cmd.equals("front")) {
                System.out.println(list.peekFirst());
            } else {
                System.out.println(list.peekLast());
            }
        }
    }
}