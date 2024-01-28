import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int ans = 0;

        for (int i = X; i <= Y; i++) {
            char[] list = String.valueOf(i).toCharArray();

            boolean flag = true;

            for (int k = 0; k < list.length / 2; k++) {
                if (list[k] != list[list.length - k - 1]) {
                    flag = false;
                    break;
                }
            }

            if (flag) ans++;
        }

        System.out.print(ans);
    }
}