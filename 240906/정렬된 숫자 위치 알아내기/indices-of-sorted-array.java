import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        Integer[] nums = Arrays.stream(br.readLine().split(" "))
            .map(Integer::parseInt)
            .toArray(Integer[]::new);
        
        Node[] list = new Node[N];
        for (int i = 0; i < N; i++) {
            list[i] = new Node(i + 1, 0, nums[i]);
        }

        Arrays.sort(list, (o1, o2) -> {
            if (o1.value < o2.value) {
                return -1;
            } else if (o1.value > o2.value) {
                return 1;
            }

            return 0;
        });

        for (int i = 0; i < N; i++) {
            list[i].changed = i + 1;
        }

        Arrays.sort(list, (o1, o2) -> {
            if (o1.origin < o2.origin) {
                return -1;
            } else if (o1.origin > o2.origin) {
                return 1;
            }

            return 0;
        });

        for (int i = 0; i < N; i++) {
            System.out.print(list[i].changed + " ");
        }
    }

    public static class Node {

        public int origin;
        public int changed;
        public int value;

        public Node(int origin, int changed, int value) {
            this.origin = origin;
            this.changed = changed;
            this.value = value;
        }
    }
}