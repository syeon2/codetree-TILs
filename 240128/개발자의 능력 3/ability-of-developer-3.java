import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[6];

        int total = 0;
        for (int i = 0; i < list.length; i++) {
            int n = sc.nextInt();

            list[i] = n;

            total += n;
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < list.length; i++) {

            for (int k = i + 1; k < list.length; k++) {

                for (int j = k + 1; j < list.length; j++) {

                    int team1 = list[i] + list[k] + list[j];
                    int team2 = total - team1;

                    ans = Math.min(ans, Math.abs(team1 - team2));
                }
            }
        }

        System.out.print(ans);
    }
}