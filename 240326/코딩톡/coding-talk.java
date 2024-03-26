import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();

        char[] cList = new char[N];
        int[] uList = new int[N];
        for (int i = 0; i < N; i++) {
            cList[i] = sc.next().charAt(0);
            uList[i] = sc.nextInt();
        }

        boolean[] people = new boolean[N];

        for (int i = 0; i < N; i++) {
            int order = i + 1;

            if (order < P) continue;
            else if (order == P) {
                for (int k = i; k >= 0; k--) {
                    if (uList[i] == uList[k]) {
                        int personIdx = cList[k] - 'A';

                        people[personIdx] = true;
                    } else break;
                }
            } else {
                if (uList[i] == 0) Arrays.fill(people, true);
                else {
                    int personIdx = cList[i] - 'A';
                    people[personIdx] = true;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (!people[i]) System.out.printf("%s ", (char) (i + 'A'));
        }
    }
}