import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < 11 && b < 11 && c < 11) System.out.print(-1);
        else if (a == 11 && b == 11 && c == 11) System.out.print(0);
        else {
            int startA = 11;
            int startB = 11;
            int startC = 11;

            int cnt = 0;

            while (true) {
                if (startA == a && startB == b && startC == c) break;

                cnt++;

                startC += 1;

                if (startC == 60) {
                    startC = 0;
                    startB += 1;
                }

                if (startB == 24) {
                    startA += 1;
                    startB = 0;
                }
            }

            System.out.print(cnt);
        }
    }
}