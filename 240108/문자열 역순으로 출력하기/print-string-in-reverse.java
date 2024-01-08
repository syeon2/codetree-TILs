import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] list = new String[4];

        for (int i = 0; i < 4; i++) {
            String s = sc.nextLine();

            list[i] = s;
        }

        for (int i = 3; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}