import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max = 0;

        int aCnt = 0;

        while (A * aCnt <= C) {

            int bCnt = 0;

            while ((A * aCnt) + (B * bCnt) <= C) {
                bCnt++;
            }

            max = Math.max(max, (A * aCnt) + (B * (bCnt - 1)));

            aCnt++;
        }

        System.out.print(max);
    }
}