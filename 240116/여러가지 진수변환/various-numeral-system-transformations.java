import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[10];

        int N = sc.nextInt();
        int a = sc.nextInt();

        int cnt = 0;

        while (N != 0) {
            list[cnt] = N % a;
            N /= a;

            cnt++;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(list[i]);
        }
    }
}