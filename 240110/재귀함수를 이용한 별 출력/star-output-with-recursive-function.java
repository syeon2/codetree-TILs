import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        recur(1, N);
    }

    public static void recur(int start, int n) {
        if (start > n) return;

        for (int i = 0; i < start; i++) {
            System.out.print("*");
        }

        System.out.println();

        recur(start + 1, n);
    }
}