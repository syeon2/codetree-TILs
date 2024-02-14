import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num < 500 && max < num) max = num;
            if (num > 500 && min > num) min = num;
        }

        System.out.printf("%d %d", max, min);
    }
}