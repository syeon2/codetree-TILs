import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] orders = sc.next().toCharArray();

        int move = 0;

        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == 'L') move--;
            else move++;
        }

        if (move == 0) System.out.print(str);
        else if (move < 0) {
            move *= -1;

            str = str.substring(move) + str.substring(0, move);

            System.out.print(str);
        } else {
            str = str.substring(str.length() - move) + str.substring(0, move);

            System.out.print(str);
        }
    }
}