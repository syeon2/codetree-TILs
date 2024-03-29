import java.util.*;

public class Main {

    public static List<Integer> list = new ArrayList<>();
    public static int K;
    public static int N;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        K = sc.nextInt();
        N = sc.nextInt();

        recur(0);
    }

    public static void recur(int cnt) {
        if (cnt == K) {
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%d ", list.get(i));
            }

            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            list.add(i);
            recur(cnt + 1);
            list.remove(list.size() - 1);
        }
    }
}