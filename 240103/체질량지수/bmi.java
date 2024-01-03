import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        double height = sc.nextDouble();
        int weight = sc.nextInt();

        height /= 100;
        height *= height;

        double bmi = weight / height;

        System.out.println((int) bmi);

        if (bmi >= 25) System.out.println("Obesity");
    }
}