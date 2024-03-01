import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list1 = new int[3];
        int[] list2 = new int[3];

        for (int i = 0; i < 3; i++) {
            list1[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            list2[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= N; k++) {
                for (int j = 1; j <= N; j++) {
                    boolean flag = false;

                    if (isSatisfied(i, list1[0], N) && isSatisfied(k, list1[1], N) && isSatisfied(j, list1[2], N)) {
                        flag = true;
                    }

                    if (isSatisfied(i, list2[0], N) && isSatisfied(k, list2[1], N) && isSatisfied(j, list2[2], N)) {
                        flag = true;
                    }

                    if (flag) ans++;
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean isSatisfied(int num, int N, int limit) {
        if (num == N) return true;

        int temp = num;

        for (int i = 0; i < 2; i++) {
            temp++;
            if (temp > limit) temp = 1;
            if (temp == N) return true;
        }

        temp = num;

        for (int i = 0; i < 2; i++) {
            temp--;
            if (temp == 0) temp = limit;
            if (temp == N) return true;
        }

        return false;
    }
}