import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int ageA = sc.nextInt();
        String sexA = sc.next();

        int ageB = sc.nextInt();
        String sexB = sc.next();

        if ((ageA >= 19 && sexA.equals("M")) || (ageB >= 19 && sexB.equals("M"))) System.out.println(1);
        else System.out.println(0);
    }
}