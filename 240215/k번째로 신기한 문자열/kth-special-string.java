import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        String T = sc.next();

        String[] list = new String[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.next();
        }

        Arrays.sort(list);

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (list[i].indexOf(T) == 0) cnt++;

            if (cnt == k) {
                System.out.print(list[i]);
                break;
            }
        }
    }
}