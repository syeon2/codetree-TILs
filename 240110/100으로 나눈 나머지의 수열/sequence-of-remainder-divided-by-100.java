import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(recur(N));
    }

    public static int recur(int idx) {
        if (idx == 1) return 2;
        else if (idx == 2) return 4;

        return (recur(idx - 1) * recur(idx - 2)) % 100;
    }
}