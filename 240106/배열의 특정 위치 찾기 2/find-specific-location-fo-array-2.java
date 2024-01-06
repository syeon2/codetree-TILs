import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int sumOdd = 0;

        int sumEven = 0;

        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();

            if (i % 2 == 0) sumEven += n;
            else sumOdd += n;
        }

        if (sumEven > sumOdd) System.out.println(sumEven - sumOdd);
        else System.out.println(sumOdd - sumEven);
    }
}