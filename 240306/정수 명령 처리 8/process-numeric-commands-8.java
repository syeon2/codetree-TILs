import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String str = sc.next();

            if (str.equals("push_front")) {
                int num = sc.nextInt();

                list.addFirst(num);
            } else if (str.equals("push_back")) {
                int num = sc.nextInt();

                list.addLast(num);
            } else if (str.equals("pop_front")) {
                int num = list.pollFirst();

                System.out.println(num);
            } else if (str.equals("pop_back")) {
                int num = list.pollLast();

                System.out.println(num);
            } else if (str.equals("size")) {
                System.out.println(list.size());
            } else if (str.equals("empty")) {
                if (list.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (str.equals("front")) {
                System.out.println(list.peekFirst());
            } else {
                System.out.println(list.peekLast());
            }
        }
    }
}