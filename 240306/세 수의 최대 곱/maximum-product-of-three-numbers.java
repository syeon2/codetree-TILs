import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int max = 0;

        if (list[0] < 0 && list[1] < 0 && list[list.length - 1] > 0) {
            max = Math.max(max, list[0] * list[1] * list[list.length - 1]);
        }

        if (list[list.length - 1] > 0 && list[list.length - 2] > 0 && list[list.length - 3] > 0) {
            max = Math.max(max, list[list.length - 1] * list[list.length - 2] * list[list.length - 3]);
        }

        for (int i = 0; i < N; i++) {
            if (list[i] == 0) {
                max = Math.max(max, 0);
                break;
            }
        }

        for (int i = 0; i <= N - 3; i++) {
            int multiply = list[i] * list[i + 1] * list[i + 2];

            max = Math.max(max, multiply);
        }

        System.out.print(max);
    }
}