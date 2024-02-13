import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int clazz = 0;
        int corridor = 0;
        int bathroom = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0) continue;
            
            if (i % 12 == 0) bathroom++;
            else if (i % 3 == 0) corridor++;
            else if (i % 2 == 0) clazz++;
        }

        System.out.printf("%d %d %d", clazz, corridor, bathroom);
    }
}