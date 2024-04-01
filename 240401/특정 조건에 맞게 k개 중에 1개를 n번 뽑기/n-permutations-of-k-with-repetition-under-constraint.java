import java.util.*;

public class Main {

    public static List<Integer> list = new ArrayList<>();
    public static int K;
    public static int N;

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        K = sc.nextInt();
        N = sc.nextInt();

        recur();

        System.out.print(sb.toString());
    }

    public static void recur() {
        if (list.size() >= 3 && (list.get(list.size() - 1) == list.get(list.size() - 2) && list.get(list.size() - 1) == list.get(list.size() - 3))) {
            return;
        }

        if (list.size() == N) {
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i)).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = 1; i <= K; i++) {
            list.add(i);
            recur();
            list.remove(list.size() - 1);
        }
    }
}