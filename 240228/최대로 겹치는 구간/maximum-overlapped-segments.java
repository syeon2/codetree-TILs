import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[201];
        int OFFSET = 100;

        for (int n = 0; n < N; n++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int i = start; i < end; i++) {
                int idx = i + OFFSET;

                list[idx]++;
            }
        }

        int max = 0;
        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }

        System.out.print(max);
    }
}