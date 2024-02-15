import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        IntWrapper[] list1 = new IntWrapper[N];
        IntWrapper[] list2 = new IntWrapper[N];

        for (int i = 0; i < N; i++) {
            IntWrapper obj = new IntWrapper(sc.nextInt(), i + 1);
            list1[i] = obj;
            list2[i] = obj;
        }

        Arrays.sort(list1, new Comparator<IntWrapper>() {
            @Override
            public int compare(IntWrapper a, IntWrapper b) {
                if (a.value == b.value) {
                    return a.num - b.num;
                }

                return a.value - b.value;
            }
        });

        for (int i = 0; i < N; i++) {
            list1[i].num = i + 1;
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", list2[i].num);
        }
    }

    public static class IntWrapper {
        public int value;
        public int num;

        public IntWrapper(int value, int num) {
            this.value = value;
            this.num = num;
        }
    }
}