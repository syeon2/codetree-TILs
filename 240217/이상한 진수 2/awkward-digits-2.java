import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        boolean flag = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == '0') {
                list[i] = '1';
                flag = true;
                break;
            }
        }

        if (!flag) list[list.length - 1] = '0';

        int ans = 0;
        for (int i = 0; i < list.length; i++) {
            ans = (ans * 2) + (list[i] - '0');
        }

        System.out.print(ans);
    }
}