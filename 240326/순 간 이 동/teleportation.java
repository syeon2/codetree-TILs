import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int case1 = Math.abs(X - Y);
        int case2 = Math.abs(X - a) + Math.abs(b - Y);
        int case3 = Math.abs(X - b) + Math.abs(a - Y);

        int ans = Math.min(case1, Math.min(case2, case3));

        System.out.print(ans);
    }
}