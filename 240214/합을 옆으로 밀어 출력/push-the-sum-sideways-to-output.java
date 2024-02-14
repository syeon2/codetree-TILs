import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += sc.nextInt();
        }

        String temp = String.valueOf(sum);

        temp = temp.substring(1) + temp.substring(0, 1);

        System.out.print(temp);
    }
}