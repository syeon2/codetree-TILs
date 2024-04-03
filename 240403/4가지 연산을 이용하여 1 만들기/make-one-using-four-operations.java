import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Queue<Node> que = new LinkedList<>();
        que.add(new Node(N, 0));

        int ans = 0;

        while (!que.isEmpty()) {
            Node node = que.remove();

            int num = node.num;
            int cnt = node.cnt;

            if (num == 1) {
                ans = cnt;
                break;
            }

            que.add(new Node(num - 1, cnt + 1));
            que.add(new Node(num + 1, cnt + 1));

            if (num % 2 == 0) {
                que.add(new Node(num / 2, cnt + 1));
            }

            if (num % 3 == 0) {
                que.add(new Node(num / 3, cnt + 1));
            }
        }

        System.out.print(ans);
    }

    public static class Node {
        public int num;
        public int cnt;

        public Node(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }
    }
}