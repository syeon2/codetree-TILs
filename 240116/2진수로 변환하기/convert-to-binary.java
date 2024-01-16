import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[20];
        int cnt = 0;

        while (N != 0) {
            if (N % 2 == 0) list[cnt] = 0;
            else list[cnt] = 1;

            N /= 2;
            cnt++;
        }

        if (cnt == 0) System.out.print(0);
        else {
            for (int i = cnt - 1; i >= 0; i--) {
                System.out.print(list[i]);
            }
        }
    }
}