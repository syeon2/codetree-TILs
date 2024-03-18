import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Deque<Integer> deq = new LinkedList<>();

        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            deq.add(i);
        }

        while (deq.size() != 1) {
            deq.removeFirst();
            deq.addLast(deq.removeFirst());
        }

        System.out.print(deq.removeFirst());
    }
}