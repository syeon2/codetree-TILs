import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        for (int i = 0; i < N; i++) {
            if ((i + 1) % 2 == 1) System.out.printf("%d ", list[i / 2]);
        }
    }
}