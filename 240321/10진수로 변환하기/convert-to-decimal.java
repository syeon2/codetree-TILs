import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans = (ans * 2) + (arr[i] - '0');
        }

        System.out.print(ans);
    }
}