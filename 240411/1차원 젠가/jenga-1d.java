import java.util.*;

public class Main {

    public static int N;
    public static int[] list;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        list = new int[201];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int total = N;
        for (int i = 0; i < 2; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;

            total -= (end - start + 1);

            for (int k = 0; k < 100; k++) {
                list[k + start] = list[k + end + 1];
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(total).append("\n");
        
        for (int i = 0; i < total; i++) {
            sb.append(list[i]).append("\n");
        }

        System.out.print(sb);
    }
}