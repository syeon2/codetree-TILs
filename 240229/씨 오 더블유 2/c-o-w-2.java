import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        char[] list = sc.next().toCharArray();

        int ans = 0;
        for (int i = 0; i < list.length; i++) {

            if (list[i] == 'C') {

                for (int k = i + 1; k < list.length; k++) {

                    if (list[k] == 'O') {

                        for (int j = k + 1; j < list.length; j++) {

                            if (list[j] == 'W') ans++;
                        }
                    }
                }
            }
        }

        System.out.print(ans);
    }
}