import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N + 1];
        list[1] = 1;
        list[2] = 1;

        for (int i = 3; i <= N; i++) {
            list[i] = list[i - 1] + list[i - 2];
        }

        System.out.print(list[N]);
    }
}