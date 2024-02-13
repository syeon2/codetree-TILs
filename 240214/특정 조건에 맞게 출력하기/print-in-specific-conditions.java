import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int num;

        while ((num = sc.nextInt()) != 0) {
            if (num % 2 == 1) System.out.printf("%d ", num + 3);
            else System.out.printf("%d ", num / 2);
        }
    }
}