import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int max = -1000;
        int min = 1000;

        while (true) {
            int num = sc.nextInt();

            if (num == 999 || num == -999) break;

            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.printf("%d %d", max, min);
    }
}