import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        int start = (a * 60) + b;
        int end = (c * 60) + d;

        System.out.print(end - start);
    }
}