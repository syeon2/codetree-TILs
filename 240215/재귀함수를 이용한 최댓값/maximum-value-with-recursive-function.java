import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        System.out.print(recur(list, n - 1));
    }

    public static int recur(int[] list, int idx) {
        if (idx == 0) return list[idx];

        return Math.max(recur(list, idx - 1), list[idx]);
    }
}