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

        if (x2 < a1 || a2 < x1 || y2 < b1 || b2 < y1) System.out.print("nonoverlapping");
        else System.out.print("overlapping");
    }
}