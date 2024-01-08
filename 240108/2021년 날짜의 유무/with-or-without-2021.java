import java.util.Scanner;

public class Main {
    public static int[] list = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        if (isExist(M, D)) System.out.print("Yes");
        else System.out.print("No");
    }

    public static boolean isExist(int m, int d) {
        if (m > 12) return false;
        
        if (list[m - 1] < d) return false;
        else return true;
    }
}