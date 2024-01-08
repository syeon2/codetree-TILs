import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String s = sc.next();

        int cnt = 0;
        int idx = 0;

        while (true) {
            int temp = str.indexOf(s, idx);

            if (temp == -1) break;
            else {
                cnt++;
                idx = temp + 1;
            }
        }

        System.out.print(cnt);
    }
}