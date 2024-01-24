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
        for (int i = 0; i < N - 1; i++) {

            for (int k = i + 1; k < N; k++) {

                if (i + 1 == k) continue;
                else {
                    int temp = 0;

                    temp += list[i] + list[k];

                    if (max < temp) max = temp;
                }
            }
        }

        System.out.print(max);
    }
}