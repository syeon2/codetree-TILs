import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] list = sc.nextLine().split(" ");

        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}