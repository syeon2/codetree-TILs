import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        for (int i = 0; i < list.length; i++) {
            if (list[i] >= 'a' && list[i] <= 'z') {
                System.out.print((char) (list[i] - 'a' + 'A'));
            } else System.out.print((char) (list[i] - 'A' + 'a'));
        }
    }
}