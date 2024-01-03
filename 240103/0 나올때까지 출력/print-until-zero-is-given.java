import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();

            if (num == 0) break;

            System.out.println(num);
        }
    }
}