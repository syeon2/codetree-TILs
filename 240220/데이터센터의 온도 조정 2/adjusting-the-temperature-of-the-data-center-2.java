import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[1001];

        int N = sc.nextInt();
        int C = sc.nextInt();
        int G = sc.nextInt();
        int H = sc.nextInt();

        for (int n = 0; n < N; n++) {
            int Ta = sc.nextInt();
            int Tb = sc.nextInt();

            for (int i = 1; i <= 1000; i++) {
                if (i < Ta) list[i] += C;
                else if (i >= Ta && i <= Tb) list[i] += G;
                else list[i] += H;
            }
        }

        int max = 0;

        for (int i = 1; i <= 1000; i++) {
            if (max < list[i]) max = list[i];
        }

        System.out.print(max);
    }
}