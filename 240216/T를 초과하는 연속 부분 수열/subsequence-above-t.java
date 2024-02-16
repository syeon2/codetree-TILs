import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];

        int t = sc.nextInt();

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int cnt = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            if (list[i] > t) cnt++;
            else {
                max = Math.max(max, cnt);
                cnt = 0;
            }
        }

        max = Math.max(max, cnt);
        
        System.out.print(max);
    }
}