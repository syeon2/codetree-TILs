import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        int cnt = 0;
        for (int i = 0; i < list.length; i++) {

            for (int k = i + 1; k < list.length; k++) {
                if (list[i] == '(' && list[k] == ')') cnt++;
            }
        }

        System.out.print(cnt);
    }
}