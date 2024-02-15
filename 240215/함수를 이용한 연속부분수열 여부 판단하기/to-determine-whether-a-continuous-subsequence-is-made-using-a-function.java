import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] n1List = new int[n1];
        int[] n2List = new int[n2];

        for (int i = 0; i < n1; i++) {
            n1List[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            n2List[i] = sc.nextInt();
        }

        if (isSequence(n1List, n2List)) System.out.print("Yes");
        else System.out.print("No");
    }

    public static boolean isSequence(int[] n1List, int[] n2List) {
        boolean flag = false;

        for (int i = 0; i < n1List.length - n2List.length + 1; i++) {

            boolean satis = true;

            for (int k = 0; k < n2List.length; k++) {
                if (n1List[i + k] != n2List[k]) {
                    satis = false;
                    break;
                }
            }

            if (satis) {
                flag = true;
                break;
            }
        }

        if (flag) return true;
        else return false;
    }
}