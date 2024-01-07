import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] list = new int[b];

        while (a > 1) {
            int temp = a / b;

            int temp2 = a % b;

            list[temp2]++;

            a = temp;
        }

        int ans = 0;

        for (int i = 0; i < b; i++) {
            ans += list[i] * list[i];
        }

        System.out.println(ans);
    }
}