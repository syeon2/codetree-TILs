import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int change = sc.nextInt();

        if (change >= 3000) System.out.println("book");
        else if (change >= 1000) System.out.println("mask");
        else System.out.println("no");
    }
}