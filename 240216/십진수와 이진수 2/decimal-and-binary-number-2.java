import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] binary = sc.next().toCharArray();

        // 십진수로 바꾸기
        int integer = 0;
        for (int i = 0; i < binary.length; i++) {
            integer = (integer * 2) + (binary[i] - '0');
        }

        integer *= 17;

        // 이진수로 바꾸기
        StringBuilder sb = new StringBuilder();

        while (integer > 1) {
            if (integer % 2 == 0) sb.insert(0, "0");
            else sb.insert(0, "1");

            integer /= 2;
        }

        if (integer != 0) sb.insert(0, "1");

        System.out.print(sb);
    }
}