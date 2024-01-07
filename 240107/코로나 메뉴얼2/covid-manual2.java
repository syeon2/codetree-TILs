import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[4];

        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int n = sc.nextInt();

            if (s.equals("Y") && n >= 37) list[0]++;
            else if (s.equals("N") && n >= 37) list[1]++;
            else if (s.equals("Y") && n < 37) list[2]++;
            else list[3]++;
        }

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d ", list[i]);
        }

        if (list[0] >= 2) System.out.print("E");
    }
}