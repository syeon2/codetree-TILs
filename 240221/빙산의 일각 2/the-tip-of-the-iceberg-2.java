import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int max = 0;
        int[] mt = new int[N];
        for (int i = 0; i < N; i++) {
            mt[i] = sc.nextInt();

            max = Math.max(max, mt[i]);
        }

        int ans = 0;
        
        for (int h = 0; h < max; h++) {

            int[] temp = new int[N];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = mt[i] - h;
            }

            boolean flag = false;
            int cnt = 0;

            for (int i = 0; i < temp.length; i++) {
                if (!flag && temp[i] > 0) {
                    flag = true;
                    cnt++;
                } else if (temp[i] <= 0) flag = false;
            }

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}