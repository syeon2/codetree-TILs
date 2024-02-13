import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int weight = sc.nextInt();
        
        double squaredHeight = (double) height / 100 * (double) height / 100;

        int bmi = (int) (weight / squaredHeight);

        System.out.println(bmi);

        if (bmi >= 25) System.out.println("Obesity");
    }
}