import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int value = N;
        int cnt = 0;

        while (cnt != 2) {
            System.out.printf("%d ", value);
            value += N;

            if (value % 5 == 0) cnt++;
        }

        System.out.print(value);
    }
}