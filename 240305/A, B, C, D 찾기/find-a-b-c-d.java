import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = 15;
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int A = list[0];
        int B = list[1];

        int C = list[N - 1] - list[N - 4];
        int CD = list[N - 1] - (A + B);

        int D = CD - C;

        System.out.printf("%d %d %d %d", A, B, C, D);
    }
}