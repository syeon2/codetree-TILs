import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String temp1 = "";
        
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if (c >= '0' && c <= '9') temp1 = temp1.concat(String.valueOf(c));
            else break;
        }

        String temp2 = "";

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);

            if (c >= '0' && c <= '9') temp2 = temp2.concat(String.valueOf(c));
            else break;
        }

        System.out.print(Integer.parseInt(temp1) + Integer.parseInt(temp2));
    }
}