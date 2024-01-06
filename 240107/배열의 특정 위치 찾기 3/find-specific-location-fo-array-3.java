import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int thrid = 0;

        while (true) {
            int n = sc.nextInt();

            if (first == 0) {
                first = n;
            } else if (second == 0) {
                second = n;
            } else if (thrid == 0) {
                thrid = n;
            } else if (n == 0) break;
            else {
                first = second;
                second = thrid;
                thrid = n;
            }
        }

        System.out.print(first + second + thrid);
    }
}