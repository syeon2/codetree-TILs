import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] people = new int[10001];
        for (int n = 0; n < N; n++) {
            int person = sc.nextInt();
            char card = sc.next().charAt(0);

            if (card == 'G') people[person] += 1;
            else people[person] += 2;
        }

        int max = 0;
        for (int i = 1; i < people.length - K; i++) {

            int temp = 0;
            for (int k = i; k <= i + K; k++) {
                temp += people[k];
            }

            max = Math.max(max, temp);
        }

        System.out.print(max);
    }
}