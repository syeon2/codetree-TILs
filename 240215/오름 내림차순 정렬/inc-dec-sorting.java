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

        Arrays.sort(list);

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", list[i]);
        }

        System.out.println();

        Integer[] list2 = Arrays.stream(list).boxed().toArray(Integer[]::new);
        Arrays.sort(list2, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", list2[i]);
        }
    }
}