import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] n1List = new int[n1];
        int[] n2List = new int[n2];

        for (int n = 0; n < n1; n++) {
            int num = sc.nextInt();

            n1List[n] = num;
        }

        for (int n = 0; n < n2; n++) {
            int num = sc.nextInt();

            n2List[n] = num;
        }

        boolean satisfied = false;

        for (int i = 0; i <= n1 - n2; i++) {

            boolean temp = true;

            for (int k = 0; k < n2; k++) {
                if (n1List[i + k] != n2List[k]) {
                    temp = false;
                    break;
                }
            }

            if (temp) {
                satisfied = true;
                break;
            }
        }

        if (satisfied) System.out.print("Yes");
        else System.out.print("No");
    }
}