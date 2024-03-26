import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        int case1 = Math.abs(A - B);
        int case2 = Math.abs(A - x) + Math.abs(y - B);
        int case3 = Math.abs(A - y) + Math.abs(x - B);

        int ans = Math.min(case1, Math.min(case2, case3));

        System.out.print(ans);
    }
}