import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[9];

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();

            list[n - 1]++;
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(list[i]);
        }
    }
}