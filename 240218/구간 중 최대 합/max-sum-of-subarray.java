import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n - k + 1; i++) {

            int temp = 0;
            for (int j = i; j < i + k; j++) {
                temp += list[j];
            }

            max = Math.max(max, temp);
        }

        System.out.print(max);
    }
}