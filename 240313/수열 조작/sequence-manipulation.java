import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        while (deque.size() != 1) {
            deque.pollFirst();

            deque.addLast(deque.pollFirst());
        }

        System.out.print(deque.peekFirst());
    }
}