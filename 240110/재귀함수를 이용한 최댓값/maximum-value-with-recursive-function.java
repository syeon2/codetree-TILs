import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        System.out.print(recur(list, 0, list[0]));
    }

    public static int recur(int[] list, int idx, int max) {
        if (idx == list.length) return max;

        if (list[idx] > max) return recur(list, idx + 1, list[idx]);
        else return recur(list, idx + 1, max);
    }
}