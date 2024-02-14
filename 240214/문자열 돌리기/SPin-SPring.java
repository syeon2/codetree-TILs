import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        System.out.println(list);
        for (int i = 0; i < list.length; i++) {
            char temp = list[list.length - 1];

            for (int k = list.length - 1; k >= 1; k--) {
                list[k] = list[k - 1];
            }

            list[0] = temp;

            System.out.println(list);
        }
    }
}