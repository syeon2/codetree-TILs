import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] orders = sc.next().toCharArray();

        int move = 0;

        // L과 R의 위치 종합
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == 'L') move--;
            else if (orders[i] == 'R') move++;
        }

        // move가 음수일 경우 : L로 이동
        // move가 양수일 경우 : R로 이동
        // move가 0이거나 move가 음수, 양수로 str.length()의 배수일 경우 : 이동 X
        if (move == 0 || Math.abs(move) % str.length() == 0) {}
        else if (move < 0) {
            move *= -1;

            move %= str.length();

            str = str.substring(move) + str.substring(0, move);
        } else {
            move %= str.length();
            
            str = str.substring(str.length() - move) + str.substring(0, str.length() - move);
        }

        System.out.print(str);
    }
}