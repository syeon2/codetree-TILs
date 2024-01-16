import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        int num = 0;

        for (int i = 0; i < list.length; i++) {
            num = num * 2 + (list[i] - '0');
        }

        num *= 17;

        int cnt = 0;
        int[] binary = new int[20];

        while (num != 0) {
            binary[cnt] = num % 2;
            num /= 2;

            cnt++;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}