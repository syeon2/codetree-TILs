import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        Node[] list = new Node[N];

        for (int i = 0; i < N; i++) {
            Integer[] nList = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
            
            list[i] = new Node(i + 1, nList[0], nList[1]);
        }

        Arrays.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                int dist1 = Math.abs(n1.x) + Math.abs(n1.y);
                int dist2 = Math.abs(n2.x) + Math.abs(n2.y);

                if (dist1 < dist2) return -1;
                else if (dist1 > dist2) return 1;

                return 0;
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(list[i].num);
        }
    }

    public static class Node {

        public int num;
        public int x;
        public int y;

        public Node(int num, int x, int y) {
            this.num = num;
            this.x = x;
            this.y = y;
        }
    }
}