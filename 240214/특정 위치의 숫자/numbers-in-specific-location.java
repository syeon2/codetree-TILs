import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[10];

        for (int i = 0; i < 10; i++) {
            list[i] = sc.nextInt();
        }

        System.out.print(list[2] + list[4] + list[9]);
    }
}