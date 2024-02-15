import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list1 = sc.next().toCharArray();
        char[] list2 = sc.next().toCharArray();

        Arrays.sort(list1);
        Arrays.sort(list2);

        if (list1.length != list2.length) System.out.print("No");
        else {
            boolean flag = true;

            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i]) {
                    flag = false;
                    break;
                }
            }

            if (flag) System.out.print("Yes");
            else System.out.print("No");
        }
    }
}