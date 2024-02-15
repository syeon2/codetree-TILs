import java.util.Scanner;

public class Main {

    public static int[] list;
    public static int m;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        m = sc.nextInt();

        list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        System.out.print(cmd());
    }

    public static int cmd() {
        int sum = 0;

        while (m >= 1) {
            sum += list[m - 1];

            if (m % 2 == 1) m -= 1;
            else m /= 2;
        }

        return sum;
    }
}