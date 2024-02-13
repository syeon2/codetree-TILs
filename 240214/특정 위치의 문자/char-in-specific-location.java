import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        char c = sc.next().charAt(0);

        boolean flag = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == c) {
                System.out.print(i);
                flag = true;
                break;
            }
        }

        if (!flag) System.out.print("None");
    }
}