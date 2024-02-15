import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[202];

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt() + 100;
            int b = sc.nextInt() + 100;

            for (int k = a; k < b; k++) {
                list[k]++;
            }
        }

        int max = 0;
        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) max = list[i];
        }

        System.out.print(max);
    }
}