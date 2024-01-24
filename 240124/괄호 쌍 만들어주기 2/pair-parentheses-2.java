import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        int cnt = 0;
        for (int i = 0; i < list.length - 1; i++) {

            for (int k = i + 1; k < list.length - 1; k++) {

                if (list[i] == '(' && list[i + 1] == '(' && list[k] == ')' && list[k + 1] == ')') cnt++;
            }
        }

        System.out.print(cnt);
    }
}