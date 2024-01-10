import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        char[] list1 = str1.toCharArray();
        char[] list2 = str2.toCharArray();

        Arrays.sort(list1);
        Arrays.sort(list2);

        if (String.valueOf(list1).equals(String.valueOf(list2))) System.out.print("Yes");
        else System.out.print("No");
    }
}