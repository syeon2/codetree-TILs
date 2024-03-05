import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        int rightX = Math.min(x1, a1);
        int rightY = Math.min(y1, b1);

        int leftX = Math.max(x2, a2);
        int leftY = Math.max(y2, b2);

        int maxLine = Math.max((leftX - rightX), (leftY - rightY));

        System.out.print(maxLine * maxLine);
    }
}