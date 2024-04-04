import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N + 1];
        
        for (int i = 1; i <= N; i++) {
            if (i <= 2) list[i] = i;
            else list[i] = (list[i - 1] + list[i - 2]) % 10007;
        }

        System.out.print(list[N]);
    }
}