import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list1 = new int[N];
        int[] list2 = new int[N];

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();

            list1[i] = a;
            list2[i] = a;
        }

        Arrays.sort(list2);

        for (int i = 0; i < N; i++) {

            for (int k = 0; k < N; k++) {
                if (list1[i] == list2[k]) {
                    System.out.printf("%d ", k + 1);
                    list2[k] = 0;

                    break;
                }
            }
        }
    }
}