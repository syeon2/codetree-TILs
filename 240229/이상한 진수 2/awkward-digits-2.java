import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        int maxAns = 0;
        for (int i = 0; i < list.length; i++) {

            int temp = 0;

            if (list[i] == '1') list[i] = '0';
            else list[i] = '1';

            for (int k = 0; k < list.length; k++) {
                temp = (temp * 2) + (list[k] - '0');
            }

            if (maxAns < temp) maxAns = temp;

            if (list[i] == '1') list[i] = '0';
            else list[i] = '1';
        }

        System.out.print(maxAns);
    }
}