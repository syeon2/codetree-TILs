import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];
        int[] idxes = new int[1001];

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();

            list[i] = n;
            idxes[list[i]]++;
        }

        int max = -1;

        for (int i = 0; i < N; i++) {
            int num = list[i];

            if (idxes[num] == 1) {
                if (num > max) max = num;
            }
        }

        System.out.print(max);
    }
}