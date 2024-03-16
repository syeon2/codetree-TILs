import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String cmd = sc.next();

            if (cmd.equals("push_back")) {
                int num = sc.nextInt();

                list.add(num);
            } else if (cmd.equals("pop_back")) {
                int idx = list.size() - 1;

                list.remove(idx);
            } else if (cmd.equals("size")) {
                sb.append(list.size()).append("\n");
            } else {
                int idx = sc.nextInt() - 1;

                sb.append(list.get(idx)).append("\n");
            }
        }

        System.out.print(sb);
    }
}