import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();

        if (x1 <= x4 && x3 <= x2) System.out.print("intersecting");
        else if (x3 <= x2 && x1 <= x4) System.out.print("intersecting");
        else System.out.print("nonintersecting");
    }
}