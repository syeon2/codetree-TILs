import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int[] list = new int[26];

        int cnt = 0;

        check(list, str);

        for (int i = 0; i < list.length; i++) {
            if (list[i] > 0) cnt++;
        }

        if (cnt >= 2) System.out.print("Yes");
        else System.out.print("No");
    }

    public static void check(int[] list, String str) {
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';

            list[idx]++;
        }
    }
}