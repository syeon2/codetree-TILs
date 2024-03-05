import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[3];
        for (int i = 0; i < 3; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int ans = 0;
        if (list[1] == list[0] + 1 && list[2] == list[1] + 1) ans = 0;
        else if (list[1] == list[0] + 2 || list[2] == list[1] + 2) ans = 1;
        else ans = 2;

        System.out.print(ans);
    }
}