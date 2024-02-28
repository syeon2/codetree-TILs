import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int start = (11 * 24 * 60) + (11 * 60) + 11;
        int end = (a * 24 * 60) + (b * 60) + c;

        if (start > end) System.out.print(-1);
        else {
            System.out.print(end - start);
        }
    }
}