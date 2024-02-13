import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] list = new int[a];

        while (a > 1) {
            int idx = a % b;

            list[idx]++;

            a /= b;
        }

        int ans = 0;

        for (int i = 0; i < list.length; i++) {
            ans += list[i] * list[i];
        }

        System.out.print(ans);
    }
}