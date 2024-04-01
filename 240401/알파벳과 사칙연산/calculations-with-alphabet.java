import java.util.*;

public class Main {

    public static char[] list;
    public static int[] alp = new int[6];

    public static int ans = Integer.MIN_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        list = sc.next().toCharArray();

        permutation(0);

        System.out.print(ans);
    }

    public static int calculate() {
        int total = 0;

        for (int i = 0; i < list.length; i++) {
            if (i == 0) {
                char c = list[i];

                int idx = c - 'a';

                total = alp[idx];
            } else {
                if (list[i] == '+') {
                    int idx = list[i + 1] - 'a';

                    total += alp[idx];
                    i++;
                } else if (list[i] == '-') {
                    int idx = list[i + 1] - 'a';

                    total -= alp[idx];
                    i++;
                } else if (list[i] == '*') {
                    int idx = list[i + 1] - 'a';

                    total *= alp[idx];
                    i++;
                }
            }
        }

        return total;
    }

    public static void permutation(int idx) {
        if (idx == 6) {
            int cal = calculate();

            ans = Math.max(ans, cal);
            return;
        }

        for (int i = 1; i <= 4; i++) {
            alp[idx] = i;
            permutation(idx + 1);
        }
    }
}