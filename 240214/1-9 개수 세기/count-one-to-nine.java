import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[10];

        for (int n = 0; n < N; n++) {
            int num = sc.nextInt();

            list[num]++;
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(list[i]);
        }
    }
}