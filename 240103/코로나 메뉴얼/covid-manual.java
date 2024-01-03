import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int temp = sc.nextInt();

            if (s.equals("Y") && temp >= 37) count++;
        }

        if (count >= 2) System.out.println("E");
        else System.out.println("N");
    }
}