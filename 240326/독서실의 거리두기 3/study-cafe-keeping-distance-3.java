import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] list = sc.next().toCharArray();

        int max = 0;
        int min = 1001;

        int prev = 0;
        for (int i = 1; i < N; i++) {
            if (list[i] == '0') continue;

            max = Math.max(max, i - prev);
            min = Math.min(min, i - prev);
            prev = i;
        }

        System.out.print(Math.min(min, max / 2));
    }
}