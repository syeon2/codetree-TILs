import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (str.length() == 1 && str.equals("1")) System.out.print(1);
        else if (str.length() == 1 && str.equals("0")) System.out.print(0);
        else System.out.print(solution(str));
    }

    public static int solution(String num) {
        int temp = 0;

        boolean flag = false;

        for (int i = 0; i < num.length(); i++) {

            if (num.charAt(i) == '1') temp += Math.pow(2, num.length() - i - 1);
            else {
                if (flag) continue;
                else {
                    temp += Math.pow(2, num.length() - i - 1);
                    flag = true;
                }
            }
        }

        return temp;
    }
}