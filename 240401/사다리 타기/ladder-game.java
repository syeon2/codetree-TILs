import java.util.*;

public class Main {

    public static List<Width> list = new ArrayList<>();
    public static List<Width> ansList = new ArrayList<>();
    public static int[] init;

    public static int N;
    public static int M;
    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        init = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            init[i] = i;
        }

        ans = M;

        for (int m = 0; m < M; m++) {
            int left = sc.nextInt();
            int right = left + 1;
            int depth = sc.nextInt();

            list.add(new Width(left, right, depth));
        }

        permutation(0);

        System.out.print(ans);
    }

    public static void check() {
        int[] temp = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            temp[i] = i;
        }

        ansList.sort((a, b) -> a.depth - b.depth);

        for (int i = 0; i < ansList.size(); i++) {
            int left = ansList.get(i).left;
            int right = ansList.get(i).right;
            
            int tempValue = temp[left];
            temp[left] = temp[right];
            temp[right] = tempValue;
        }

        if (ansList.size() == M) init = temp;
        else {
            for (int i = 1; i <= N; i++) {
                if (temp[i] != init[i]) return;
            }

            ans = Math.min(ans, ansList.size());
        }
    }

    public static void permutation(int depth) {
        if (depth == M) {
            check();
            return;
        }

        ansList.add(list.get(depth));
        permutation(depth + 1);
        ansList.remove(ansList.size() - 1);
        permutation(depth + 1);
    }

    public static class Width {
        public int left;
        public int right;
        public int depth;

        public Width(int left, int right, int depth) {
            this.left = left;
            this.right = right;
            this.depth = depth;
        }
    }
}