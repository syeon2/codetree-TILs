import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] list1 = new int[n1];
        int[] list2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            list1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            list2[i] = sc.nextInt();
        }

        boolean lastFlag = false;

        for (int i = 0; i <= n1 - n2; i++) {
            
            boolean flag = true;

            int idx = i;

            for (int k = 0; k < n2; k++) {
                if (list1[idx] != list2[k]) {
                    flag = false;
                    break;
                } else idx++;
            }

            if (flag) {
                System.out.print("Yes");
                lastFlag = true;
                break;
            }
        }

        if (!lastFlag) System.out.print("No");
    }
}