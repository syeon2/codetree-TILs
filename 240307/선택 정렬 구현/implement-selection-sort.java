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
            
            int min = i;

            for (int k = i + 1; k < N; k++) {
                if (list[min] > list[k]) min = k;
            }

            int temp = list[min];
            list[min] = list[i];
            list[i] = temp;
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", list[i]);
        }
    }
}