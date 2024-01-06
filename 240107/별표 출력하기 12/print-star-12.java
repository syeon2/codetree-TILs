import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= (n / 2) * 2; i++) {

            if (i == 1) {
                for (int k = 0; k < n; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else if (i == 2) {
                System.out.print("  ");

                for (int k = 0; k < (n / 2); k++) {
                    System.out.print("*   ");
                }

                System.out.println();
            } else {
                int blank = 1;
                int star = (n / 2) - 1;

                int cnt = 0;

                while (star >= 1) {
                    System.out.print("  ");

                    for (int k = 1; k <= blank; k++) {
                        System.out.print("    ");
                    }
                
                    for (int k = 1; k <= star; k++) {
                        System.out.print("*   ");
                    }

                    System.out.println();

                    if (cnt == 1) {
                        cnt = 0;
                        blank++;
                        star--;
                    } else {
                        cnt++;
                    }
                }

                break;
            }
        }
    }
}