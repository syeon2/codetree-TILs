import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list1 = new int[N];
        for (int i = 0; i < N; i++) {
            list1[i] = sc.nextInt();
        }

        int[] list2 = new int[N];
        for (int i = 0; i < N; i++) {
            list2[i] = sc.nextInt();
        }

        Arrays.sort(list1);
        Arrays.sort(list2);

        boolean flag = true;
        for (int i = 0; i < N; i++) {
            if (list1[i] != list2[i]) {
                flag = false;
                break;
            }
        }

        if (flag) System.out.print("Yes");
        else System.out.print("No");
    }
}