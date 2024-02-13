import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= 90 && (b >= 95 && b <= 100)) System.out.println(10);
        else if (a >= 90 && b >= 90) System.out.println(5);
        else System.out.println(0);
    }
}