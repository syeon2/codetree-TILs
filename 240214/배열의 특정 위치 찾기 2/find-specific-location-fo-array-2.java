import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int odd = 0;
        int even = 0;

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();

            if (i % 2 == 0) even += num;
            else odd += num;
        }

        if (even > odd) System.out.print(even - odd);
        else System.out.print(odd - even);
    }
}