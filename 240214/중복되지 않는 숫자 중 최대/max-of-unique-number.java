import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[1001];

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            list[num]++;
        }

        int max = -1;

        for (int i = 1000; i >= 1; i--) {
            if (list[i] == 1) {
                max = i;
                break;
            }
        }

        System.out.print(max);
    }
}