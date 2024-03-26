import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();

        boolean[] people = new boolean[N];
        int[] records = new int[N];

        for (int i = 1; i <= M; i++) {
            char c = sc.next().charAt(0);
            int u = sc.nextInt();

            if (i < P) continue;

            if (u == 0) Arrays.fill(people, true);
            else {
                int idx = c - 'A';

                people[idx] = true;
            }
        }

        for (int i = 0; i < N; i++) {
            if (!people[i]) {
                System.out.printf("%s ", (char) (i + 'A'));
            }
        }
    }
}