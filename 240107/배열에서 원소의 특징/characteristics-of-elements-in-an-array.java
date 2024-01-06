import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int num = 0;

        while (true) {
            int n = sc.nextInt();

            if (n % 3 == 0) break;
            else num = n;
        }

        System.out.println(num);
    }
}