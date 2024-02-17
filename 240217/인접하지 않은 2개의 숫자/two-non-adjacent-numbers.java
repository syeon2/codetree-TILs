import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < list.length; i++) {

            for (int k = i + 2; k < list.length; k++) {
                if (list[i] + list[k] > max) max = list[i] + list[k];
            }
        }

        System.out.print(max);
    }
}