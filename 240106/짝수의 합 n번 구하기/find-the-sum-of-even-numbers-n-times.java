import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int temp = 0;

            for (int k = a; k <= b; k++) {
                if (k % 2 == 0) temp += k;    
            }

            System.out.println(temp);
        }
    }
}