import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int start = (60 * 24 * 11) + (60 * 11) + 11;
        int end = (60 * 24 * a) + (60 * b) + c;

        if (end < start) System.out.print(-1);
        else System.out.print(end - start);
    }
}