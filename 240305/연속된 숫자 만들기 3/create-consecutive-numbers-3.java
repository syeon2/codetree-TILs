import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] list = {a, b, c};
        Arrays.sort(list);

        int maxGap = 0;
        for (int i = 1; i < 3; i++) {
            int gap = list[i] - list[i - 1];

            maxGap = Math.max(maxGap, gap);
        }

        System.out.print(maxGap - 1);
    }
}