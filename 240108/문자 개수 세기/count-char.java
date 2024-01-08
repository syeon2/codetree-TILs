import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int cnt = 0;
        
        char c = sc.next().charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) cnt++;
        }

        System.out.println(cnt);
    }
}