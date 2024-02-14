import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        char temp = list[0];

        for (int i = 1; i < list.length; i++) {
            list[i - 1] = list[i];
        }

        list[list.length - 1] = temp;

        System.out.print(list);
    }
}