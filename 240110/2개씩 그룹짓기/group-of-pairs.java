import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N * 2];

        for (int i = 0; i < N * 2; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int max = list[0] + list[list.length - 1];

        for (int i = 0; i < N; i++) {
            if (max < list[i] + list[list.length - i - 1]) max = list[i] + list[list.length - 1 - i];
        }

        System.out.print(max);
    }
}