import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        int sum = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] >= '0' && list[i] <= '9') {
                sum += Integer.parseInt(String.valueOf(list[i]));
            }
        }
        
        System.out.print(sum);
    }
}