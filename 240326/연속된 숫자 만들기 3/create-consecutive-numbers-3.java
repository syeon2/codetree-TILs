import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] list = {a, b, c};
        Arrays.sort(list);

        if (a + 1 == b && b + 1 == c) System.out.print(0);
        else {
            int fGap = b - a;
            int sGap = c - b;

            System.out.print(Math.max(fGap, sGap) - 1);
        }
    }
}