import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        IntWrapper a = new IntWrapper(n);
        IntWrapper b = new IntWrapper(m);

        swap(a, b);

        System.out.printf("%d %d", a.value, b.value);
    }

    public static void swap(IntWrapper a, IntWrapper b) {
        int temp = a.value;

        a.value = b.value;
        b.value = temp;
    }

    public static class IntWrapper {
        public int value;

        public IntWrapper(int value) {
            this.value = value;
        }
    }
}