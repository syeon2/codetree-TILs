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

        if (isSequence(list1, list2)) System.out.print("Yes");
        else System.out.print("No");
    }

    public static boolean isSequence(int[] list1, int[] list2) {
        boolean flag = false;

        for (int i = 0; i < list1.length - list2.length + 1; i++) {
            boolean flag2 = true;

            for (int k = 0; k < list2.length; k++) {
                if (list1[i + k] != list2[k]) {
                    flag2 = false;
                    break;
                }
            }

            if(flag2) flag = true;
        }

        return flag;
    }
}