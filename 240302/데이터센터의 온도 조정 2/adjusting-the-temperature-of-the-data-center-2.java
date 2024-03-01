import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        int G = sc.nextInt();
        int H = sc.nextInt();

        int[] list = new int[1001];

        for (int n = 0; n < N; n++) {
            int ta = sc.nextInt();
            int tb = sc.nextInt();

            for (int i = 0; i < list.length; i++) {
                if (i < ta) list[i] += C;
                else if (i >= ta && i <= tb) list[i] += G;
                else list[i] += H;
            }
        }

        int max = 0;
        for (int i = 0; i < list.length; i++) {
            max = Math.max(max, list[i]);
        }

        System.out.print(max);
    }
}