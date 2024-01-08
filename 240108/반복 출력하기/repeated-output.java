import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printStars(N);        
    }

    public static void printStars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("12345^&*()_");
        }
    }
}