import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String cmd = sc.next();

            if (cmd.equals("push")) {
                int num = sc.nextInt();

                queue.add(num);
            } else if (cmd.equals("pop")) {
                int num = queue.remove();

                sb.append(num).append("\n");
            } else if (cmd.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (cmd.equals("empty")) {
                if (queue.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else {
                sb.append(queue.peek()).append("\n");
            }
        }

        System.out.print(sb);
    }
}