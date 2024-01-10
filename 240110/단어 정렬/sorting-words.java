import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] list = new String[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.next();
        }

        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}