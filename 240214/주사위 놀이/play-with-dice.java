import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] dice = new int[7];

        for (int i = 0; i < 10; i++) {
            int idx = sc.nextInt();

            dice[idx]++;
        }

        for (int i = 1; i <= 6; i++) {
            System.out.printf("%d - %d\n", i, dice[i]);
        }
    }
}