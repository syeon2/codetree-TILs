import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        if (a > b) {
            System.out.print(a + b + " " + ((int) a - (int) b));
        } else {
            System.out.print(a + b + " " + ((int) b - (int) a));
        }
    }
}