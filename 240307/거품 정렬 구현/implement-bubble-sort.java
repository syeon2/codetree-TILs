import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {

            for (int k = 0; k < N - 1; k++) {
                if (list[k] > list[k + 1]) {
                    int temp = list[k];
                    list[k] = list[k + 1];
                    list[k + 1] = temp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", list[i]);
        }
    }
}