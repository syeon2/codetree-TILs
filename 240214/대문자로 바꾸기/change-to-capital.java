import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            for (int k = 0; k < 3; k++) {
                char c = sc.next().charAt(0);

                System.out.printf("%s ", (char) (c - 'a' + 'A'));
            }

            System.out.println();
        }
    }
}