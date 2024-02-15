import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] ans = new int[N];
        IntWrapper[] list = new IntWrapper[N];

        for (int i = 0; i < N; i++) {
            list[i] = new IntWrapper(sc.nextInt(), i);
        }

        Arrays.sort(list, new Comparator<IntWrapper>() {
            @Override
            public int compare(IntWrapper a, IntWrapper b) {
                if (a.value == b.value) {
                    return a.idx - b.idx;
                }

                return a.value - b.value;
            }
        });

        for (int i = 0; i < N; i++) {
            ans[list[i].idx] = i + 1;
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", ans[i]);
        }
    }

    public static class IntWrapper {
        public int value;
        public int idx;

        public IntWrapper(int value, int idx) {
            this.value = value;
            this.idx = idx;
        }
    }
}