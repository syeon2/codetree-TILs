import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n;

        while ((n = sc.nextInt()) != 25) {
            if (n < 25) System.out.println("Higher");
            else if (n > 25) System.out.println("Lower");
        }

        System.out.println("Good");
    }
}