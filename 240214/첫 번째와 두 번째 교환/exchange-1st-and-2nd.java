import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        char a = list[0];
        char b = list[1];

        for (int i = 0; i < list.length; i++) {
            if (list[i] == a) list[i] = b;
            else if (list[i] == b) list[i] = a;
        }

        System.out.print(list);
    }
}