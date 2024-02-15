import java.util.Scanner;

public class Main {

    public static int[] list;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            System.out.println(getSum(a1, a2));
        }
    }

    public static int getSum(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += list[i - 1];
        }

        return sum;
    }
}