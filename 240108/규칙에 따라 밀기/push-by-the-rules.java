import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String direction = sc.next();

        int idx = 0;

        for (int i = 0; i < direction.length(); i++) {
            if (direction.charAt(i) == 'L') idx += -1;
            else idx += 1;
        }

        idx %= str.length();

        if (idx < 0) str = str.substring((idx * -1)) + str.substring(0, (idx * -1));
        else if (idx > 0) str = str.substring(str.length() - idx) + str.substring(0, str.length() - idx);

        System.out.print(str);
    }
}