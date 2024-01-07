import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];

        int min = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (i == 0) min = num;
            else {
                list[i] = num;
                
                if (min > num) min = num;
            }    
        }

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (list[i] == min) cnt++;
        }

        System.out.printf("%d %d", min, cnt);
    }
}