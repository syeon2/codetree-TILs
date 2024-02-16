import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        char[] n = sc.next().toCharArray();

        // a진수 n을 십진수로 바꾸기
        int integer = 0;
        for (int i = 0; i < n.length; i++) {
            integer = (integer * a) + (n[i] - '0');
        }

        // 십진수로 변환된 integer를 b진수로 바꾸기
        StringBuilder sb = new StringBuilder();
        while (integer >= b) {
            if (integer % b == 0) sb.insert(0, "0");
            else sb.insert(0, integer % b);

            integer /= b;
        }

        if (integer != 0) sb.insert(0, integer);

        System.out.print(sb);
    }
}