import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(recur(n));
        
    }

    public static int recur(int n) {
        if (n == 1) return 0;

        if (n % 2 == 0) return recur(n / 2) + 1;
        else return recur((n * 3) + 1) + 1;
    }
}