import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int K = sc.nextInt();

        int[] list = new int[N + 1];

        boolean flag = false;
        for (int m = 0; m < M; m++) {
            int student = sc.nextInt();

            list[student]++;

            if (list[student] == K) {
                System.out.print(student);
                flag = true;
                break;
            }
        }

        if (!flag) System.out.print(-1);
    }
}