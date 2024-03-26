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

        // 1. 짝수 3개
        // 2. 음수 2개 짝수 1개

        int a = list[list.length - 1];
        int b = list[list.length - 2];
        int c = list[list.length - 3];

        int case1 = a * b * c;

        a = list[0];
        b = list[1];
        c = list[list.length - 1];

        int case2 = a * b * c;

        System.out.print(Math.max(case1, case2));
    }
}