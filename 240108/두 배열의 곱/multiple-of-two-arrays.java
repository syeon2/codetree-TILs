import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];

        for (int i = 0; i < 3; i++) {

            for (int k = 0; k < 3; k++) {
                list1[i][k] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {

            for (int k = 0; k < 3; k++) {
                int n = sc.nextInt();

                System.out.printf("%d ", n * list1[i][k]);
            }

            System.out.println();
        }

        
    }
}