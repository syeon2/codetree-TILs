import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] list = new int[101];

        for (int t = 0; t < T; t++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int i = start; i <= end; i++) {
                list[i]++;
            }
        }

        int max = 0;
        for (int i = 0; i < list.length; i++) {
            max = Math.max(max, list[i]);
        }

        System.out.print(max);
    }
}