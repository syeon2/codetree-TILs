import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();

        char[] cList = new char[M + 1];
        int[] uList = new int[M + 1];
        for (int i = 1; i <= M; i++) {
            cList[i] = sc.next().charAt(0);
            uList[i] = sc.nextInt();
        }

        boolean[] people = new boolean[N];

        for (int order = 1; order <= M; order++) {
            if (order < P) continue;
            else if (order == P) {
                if (uList[order] == 0) Arrays.fill(people, true);
                else {
                    for (int k = order; k >= 0; k--) {
                        if (uList[order] == uList[k]) {
                            int personIdx = cList[k] - 'A';

                            people[personIdx] = true;
                        } else break;
                    }
                }
            } else {
                int personIdx = cList[order] - 'A';

                people[personIdx] = true;
            }
        }

        for (int i = 0; i < N; i++) {
            if (!people[i]) System.out.printf("%s ", (char) (i + 'A'));
        }
    }
}