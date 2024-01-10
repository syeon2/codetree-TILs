import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printOneToN(1, N);
        System.out.println();
        printNToOne(N);
    }

    public static void printOneToN(int start, int n) {
        if (start > n) return;

        System.out.printf("%d ", start);

        printOneToN(start + 1, n);
    }

    public static void printNToOne(int start) {
        if (start == 0) return;

        System.out.printf("%d ", start);

        printNToOne(start - 1);
    }
}