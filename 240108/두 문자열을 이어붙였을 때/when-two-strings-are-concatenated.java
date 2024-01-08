import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String temp1 = s1 + s2;
        String temp2 = s2 + s1;

        if (temp1.equals(temp2)) System.out.print("true");
        else System.out.print("false");
    }
}