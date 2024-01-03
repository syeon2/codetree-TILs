import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int k = 0; k < i; k++) {
                for (int l = 0; l < i; l++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}