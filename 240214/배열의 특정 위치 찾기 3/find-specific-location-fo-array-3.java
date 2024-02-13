import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[3];

        while (true) {
            int num = sc.nextInt();

            if (num == 0) break;

            list[0] = list[1];
            list[1] = list[2];
            list[2] = num;
        }

        int sum = list[0] + list[1] + list[2];

        System.out.print(sum);
    }
}