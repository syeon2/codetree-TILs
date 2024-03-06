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

        for (int i = 1; i < N; i++) {
            int j = i - 1;
            int key = list[i];

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = key;
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", list[i]);
        }
    }
}